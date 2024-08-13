#include "LCRSTree.h"

LCRSNode* LCRS_CreateNode( ElementType NewData )
{
    LCRSNode* NewNode = (LCRSNode*)malloc( sizeof(LCRSNode) );
    NewNode->LeftChild    = NULL;
    NewNode->RightSibling = NULL;
    NewNode->Data = NewData;

    return NewNode;
}

void LCRS_DestroyNode( LCRSNode* Node )
{
    free(Node);
}

void LCRS_DestroyTree( LCRSNode* Root )
{
    if ( Root->RightSibling != NULL )
        LCRS_DestroyTree( Root->RightSibling );

    if ( Root->LeftChild != NULL )
        LCRS_DestroyTree( Root->LeftChild );

    Root->LeftChild = NULL;
    Root->RightSibling = NULL;

    LCRS_DestroyNode( Root );
}

void LCRS_AddChildNode( LCRSNode* Parent, LCRSNode *Child)
{
    if ( Parent->LeftChild == NULL )
    {
        Parent->LeftChild = Child;
    }
    else 
    {
        LCRSNode* TempNode = Parent->LeftChild;
        while ( TempNode->RightSibling != NULL )
            TempNode = TempNode->RightSibling;

        TempNode->RightSibling = Child;        
    }
}

void LCRS_PrintTree( LCRSNode* Node, int Depth )
{
    // 들여쓰기
    int i=0; 
    for ( i=0; i<Depth-1; i++ )
        printf("   "); // 공백 3칸

    if (Depth > 0) // 자식 노드 여부 표시
        printf("+--");
    
    // 노드 데이터 출력
    printf("%c\n", Node->Data); 

    if ( Node->LeftChild != NULL )
        LCRS_PrintTree(Node->LeftChild, Depth+1);

    if ( Node->RightSibling != NULL )
        LCRS_PrintTree(Node->RightSibling, Depth);
}

// 특정 레벨 모든 노드 출력
void LCRS_PrintNodesAtLevel(LCRSNode* Root, int Level)
{
    if (Temp == NULL || Level < 0)
    {
        printf("해당 레벨은 비어있습니다");
        return;
    }

    if (Level == 0)
    {
        printf("%c ", Root->Data)
        LCRS_PrintNodesAtLevel(Root->RightSibling, Level);
    }
    else
        LCRS_PrintNodesAtLevel(Root->RightSibling, Level-1);
}  


/*
내 코드
void LCRS_PrintNodesAtLevel(LCRSNode* Root, int Level)
{
  int i;
  int depth = Level;
  LCRSNode* Temp = Root;

  for (i = 0; i < Level; i++)
  {
    if (Temp == NULL)
      printf("해당 레벨은 비어있습니다");

    if (Temp->RightSibling != NULL)
      LCRS_PrintNodesAtLevel(Temp->RightSibling, depth);

    Temp = Root->LeftChild;
    depth--;
  }
  printf("%c\n", Node->Data);

} 
*/


void LCRS_PrintNodesAtLevel(LCRSNode* Root, int Level)
{
    int i;
    if (Root == NULL || level < 0)
    {
        printf("정상적인 입력이 아닙니다.");
        return;
    }

    // 정답 상황 구현
    if (level == 0)
    {
        printf("%c ", Root->Data);
        LCRS_PrintNodesAtLevel(Root->RightSibling, Level);
    }
    // 오답 상황 정답 상황으로 이동 구현
    else
    {
        if (Root->RightSibling != NULL) LCRS_PrintNodesAtLevel(Root->RightSibling, Level);
        LCRS_PrintNodesAtLevel(Root->LeftChild, Level-1);
    }

}

