#include "Huffman.h"

HuffmanNode* Huffman_CreateNode( SymbolInfo NewData )
{
    HuffmanNode * NewNode = (HuffmanNode*)malloc( sizeof(HuffmanNode));
    NewNode->Left = NULL;
    NewNode->Right = NULL;
    NewNode->Data = NewData;

    return NewNode;
}

void Huffman_DestroyNode( HuffmanNode * Node )
{
    free(Node);
}

void Huffman_DestroyTree ( HuffmanNode * Node )
{
    if (Node == NULL )
        return;

        Huffman_DestroyTree(Node->Left);
        Huffman_DestroyTree(Node->Right);
        Huffman_DestroyNode(Node);
}
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡ 여기까진 이진트리 구축 및 해제를 위한 코드들

void Huffman_Huffman_AddBit ( BitBuffer * Buffer, char Bit )
{
    // Mask = MSB (Most Significant Bit)  데이터형의 최상위 비트
            // 대치되는 개념 : LSB (Least Significant Bit) 최하위 비트
    UCHAR Mask = 0x80;      // 2진수 :  1 0 0 0 0 0 0 0    16진수 = 80

    // 버퍼에 저장된 비트 개수가 8의 배수(가득 참) 이면
    if ( Buffer->Size % 8 == 0 )
        {
        // 버퍼 한칸 크기만큼 확장 
        Buffer->Buffer = realloc(Buffer->Buffer, sizeof(UCHAR) * ((Buffer->Size / 8) + 1));

        // ((Buffer->Size / 8) + 1)의 의미
        // (Buffer->Size / 8) = 현재 차지하고 있는 크기
        // realloc은 메모리 공간 "추가"가 아니라 현재 공간을 지정 크기만큼 "확장"하는 함수
        // +1 = 한칸 만큼 확장하겠다는거임

        // 확장한 한칸 0으로 초기화
        Buffer->Buffer[Buffer->Size / 8] = 0x00;
        }

    // Mask 현재 비트 위치로 이동
    Mask >>= Buffer->Size % 8;

    // 비트 설정
    if ( Bit == 1 )
       Buffer->Buffer[Buffer->Size / 8] |= Mask;  // Bit = 1 -> Mask 1
    else
      Buffer->Buffer[Buffer->Size / 8] &= ~Mask;  // Bit = 0 -> Mask 0

    Buffer->Size++;
}

// 트리 순회해서 각 기호의 허프만 코드 생성 + 코드 테이블에 저장
// 매개변수 (현재 허프만 트리 노드, 코드 테이블, 코드 배열, 현재 허프만 코드 길이 )
// 코드 테이블 = 각 기호(심볼)에 대치되는 코드를 전부 모아둔 테이블
// 코드 배열  = 특정 기호의 코드를 {1, 0, 1} 형태로 저장하기 위한 배열
void Huffman_BuildCodeTable( HuffmanNode* Tree, HuffmanCode CodeTable[MAX_CHAR], 
                            UCHAR Code[MAX_BIT], int Size )
{
    // 트리 끝에 도달 (순회 완료) = 종료
    // 재귀 과정에서 각 하위 트리 순회 과정의 끝 도 이 if문에 걸려서 종료
    if ( Tree == NULL )
        return;
     
    // 좌 자식쪽 순회
    // 허트만 트리 상 좌자식 = 0, 우자식 = 1 이므로 
    // 코드 배열에 0 입력 후 좌 자식으로 이동
            // 이동 시 사이즈(코드 길이) +1
    if ( Tree->Left != NULL )
    {
        Code[Size] = 0;
        Huffman_BuildCodeTable( Tree->Left, CodeTable, Code, Size + 1 );
    }

    // 우 자식쪽 순회
    // 우 자식 이동은 코드 상 1이니까 코드 배열에 1 추가하고 우자식으로 이동
            // 이동 시 사이즈(코드 길이) +1
    if ( Tree->Right != NULL )
    {
        Code[Size] = 1;
        Huffman_BuildCodeTable( Tree->Right, CodeTable, Code, Size + 1 );
    }

    // 지금 노드가 잎 노드라면
    if ( Tree->Left == NULL && Tree->Right == NULL )
    {
        int i;

        // 여태 입력된 코드 배열 = 해당 심볼의 코드
        // 코드 테이블의 해당 심볼 칸에 코드 배열 복사
        /* CdeTable 의 구조체 구성
        typedef struct TagHuffmanCode
        {
            UCHAR Code[MAX_BIT];
            int   Size;
        } HuffmanCode;
        */
        for ( i=0; i<Size; i++ ) 
            CodeTable[Tree->Data.Symbol].Code[i] = Code[i];

        // 코드 테이블 상의 해당 심볼의 코드 길이 필드에 길이 입력
        CodeTable[Tree->Data.Symbol].Size = Size;

        //UCHAR Code[MAX_BIT]    HuffmanCode의 코드 ''배열''
}

// "빈도"를 기반으로 가장 빈도가 높을수록 코드가 짧게 설계 
// => 우선순위 큐 아이디어
// 경로 길이 = 코드 길이 && 빈도가 높을수록 뿌리에 가깝게 설정
void Huffman_BuildPrefixTree( HuffmanNode** Tree, 
                              SymbolInfo SymbolInfoTable[MAX_CHAR])
{
    int       i = 0;
    PQNode    Result;
    PriorityQueue* PQ = PQ_Create(0);
    
    // 각 기호의 노드 생성
    for ( i=0; i<MAX_CHAR; i++ )
    {   
        // 기호가 쓰인 적 있는 것만 판단할거
        if ( SymbolInfoTable[i].Frequency > 0 )
        {
            // 각 기호 허프만 노드 생성
            HuffmanNode* BitNode = Huffman_CreateNode( SymbolInfoTable[i] );
            
            PQNode NewNode;
            // 빈도 = 우선순위
			NewNode.Priority = SymbolInfoTable[i].Frequency;
			NewNode.Data     = BitNode;
            PQ_Enqueue( PQ, NewNode );
        }
    }

// 잊지말아야 할 포인트
    // 1. 우선순위 큐는 단순한 Enqueu, Dequeue랑 다르게 우선순위가 가장 중요
    // 2. 허프만에서 우선순위 큐는 "트리 형성, 정렬 도구", != 허프만 트리 자체
    //    (단순하게 우선순위큐로 "꺼내서", 트리에 붙인다)

    // 큐에 노드가 1개 이상 있다면 반복
    while ( PQ->UsedSize > 1 )
    {
        // 빈도 0 노드 생성 (꺼낸 두개의 부모노드로 쓸거)
        SymbolInfo     NewData = { 0, 0 };
        HuffmanNode* BitNode = Huffman_CreateNode( NewData );
        HuffmanNode* Left;
        HuffmanNode* Right;

        PQNode QLeft;    
        PQNode QRight;
        PQNode NewNode;

        // 우선순위 큐 => 순차적으로 큐에 삽입된 노드를 순회해서 
        // 우선순위(현재는 빈도)가장 낮은 거부터 꺼낼거임
        // 꺼낸 노드는 PQNode구조체 변수 QLeft, QRight에 저장
        PQ_Dequeue( PQ, &QLeft );
        PQ_Dequeue( PQ, &QRight );

        // 꺼낸 애들은 각각 새롭게 만든 부모 노드의 양 자식으로 연결
        // 자료형 헷갈리는데 이거 뭔말임?
            // 각 기호 노드 생성 시 
            // NewNode.Data     = BitNode;
            // 각 PQNode의 Data = HuffmanNode
        Left  = (HuffmanNode*)QLeft.Data;
        Right = (HuffmanNode*)QRight.Data;

        // BitNode = 기호 노드들의 부모 노드
        // 부모 노드는 기호가 없음
        BitNode->Data.Symbol = 0;
        // 빈도는 양 자식의 빈도의 합
        BitNode->Data.Frequency =             
            Left->Data.Frequency + Right->Data.Frequency;

// ㅡㅡㅡㅡㅡㅡ 여기서부터 실질적으로 허프만 트리에 연결하는 과정
// 이 위는 허프만 트리에 연결할 부모 노드 생성 및 
// 그 부모 노드에 연결할 기호 노드 꺼내는 과정

        // 이 BitNode   = 새로 만든 부모노드
        // Left, Right = 기호의 노드 
        BitNode->Left  = Left;
        BitNode->Right = Right;

        NewNode.Priority = BitNode->Data.Frequency;
        NewNode.Data     = BitNode;
        
        // 이렇게 완성된 기호 자식 노드를 가진 부모노드 큐에 추가
        PQ_Enqueue( PQ, NewNode );
    }

    PQ_Dequeue( PQ, &Result );
    *Tree = (HuffmanNode*)Result.Data;    
}


                // 트리, 원본 문자열, 허프만 코드 변환 문자열을 저장할 버퍼, 코드 테이블)
void Huffman_Encode( HuffmanNode** Tree, UCHAR* Source, BitBuffer* Encoded, 
                    HuffmanCode CodeTable[MAX_CHAR] )
{
    int          i = 0,
                 j = 0;
    SymbolInfo     SymbolInfoTable[MAX_CHAR];
    UCHAR        Temporary[MAX_BIT];

    // 심볼 테이블에 각 심볼 = 인덱스, 빈도 0으로 초기화
    for ( i=0; i<MAX_CHAR; i++ ) 
    {
        SymbolInfoTable[i].Symbol    = i;
        SymbolInfoTable[i].Frequency = 0;
    }

    // 원본 문자열 한문자씩 불러와서 1호출 = 빈도++
    i=0;
    while ( Source[i] != '\0' )
    {
        SymbolInfoTable[Source[i++]].Frequency++;
    }

    // 트리 생성
    Huffman_BuildPrefixTree( Tree, SymbolInfoTable );
    // 
    Huffman_BuildCodeTable( *Tree, CodeTable, Temporary, 0 );

    i=0;
    while ( Source[i] != '\0' )
    {
        int   BitCount = CodeTable[Source[i]].Size;

        for ( j=0; j<BitCount; j++ )
            Huffman_Huffman_AddBit( Encoded, CodeTable[Source[i]].Code[j] );
        
        i++;
    }
}

void Huffman_Decode( HuffmanNode* Tree, BitBuffer* Encoded, UCHAR* Decoded )
{
    int i;
    int Index = 0;
    HuffmanNode* Current = Tree;

    for ( i=0; i<=Encoded->Size; i++ )
    {
        // mask는 간단하게 1 바이트를 표현하는 방법
        UCHAR Mask = 0x80; //  1000 0000 
        
        // 현재 노드 잎 노드(기호노드) => 해당 심볼 디코딩된 문자열에 추가
        // Current = 트리의 루트
        if ( Current->Left == NULL && Current->Right == NULL )
        {
            Decoded[Index++] = Current->Data.Symbol;
            Current = Tree;
        }

        // 잎 노드가 아니라면

        // Mask를 i % 8만큼 시프트하면 1000 0000 -> 0010 0000 같은 방식으로 이동
        // 이를 통해 현재 비트 위치 확인 가능
        Mask >>= i % 8;

        // Encoded->Buffer 인코딩된 비트를 저장하는 배열
        // i/8 위치의 인코딩된 비트 
        if (  (Encoded->Buffer[i/8] & Mask) != Mask )
        //현재 바이트에서 해당 비트를 마스킹하여 그 비트가 1인지 0인지를 확인

        // 여기 연산은 요약하면 1bit씩 읽어서 읽은 비트가 0이면 좌, 1이면 우로 이동하는거
        // mask는 이동 X, 해당 for문 회차에서 0, 1만 판단하는것(for 돌 때 다시 초기화됌)

            Current = Current->Left;
        else
            Current = Current->Right;
    }

    // 마지막 글자는 NULL문자로 설정
    Decoded[Index] = '\0';
}

void Huffman_PrintBinary( BitBuffer* Buffer )
{
    int i;

    for ( i=0; i<Buffer->Size; i++ )
    {
        UCHAR Mask = 0x80; //  1000 0000 
        Mask >>= i % 8;

        printf("%d", (Buffer->Buffer[i/8] & Mask) == Mask );
    }
}