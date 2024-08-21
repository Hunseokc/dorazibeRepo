#include "ShortestPath.h"

typedef struct tagVertex
{
    VElementType       Data;
    int               Visited;
    int               Index;

    struct tagVertex* Next;
    struct tagEdge*   AdjacencyList;
} Vertex;

typedef struct tagEdge
{
    int    Weight;
    struct tagEdge* Next;
    Vertex* From;
    Vertex* Target;
} Edge;

typedef struct tagGraph
{
    Vertex* Vertices;
    int     VertexCount;
} Graph;

//            판단 대상            시작 점       최단경로 점들 저장할 MST
void Dijkstra(Graph* G, Vertex* StartVertex, Graph* ShortestPath )
{
    int i = 0;

	PQNode StartNode = {0, StartVertex};
    PriorityQueue * PQ = PQ_Create(10);

    Vertex * CurrentVertex = NULL;
    Edge * CurrentEdge     = NULL;

    // 각 정점의 시작 ~ 자신까지 최단거리 저장하는 배열
    int * Weights = (int*) malloc( sizeof(int) * G->VertexCount);

// 정확히는 해당 요건의 정점이 무엇인지 "정점 포인터"를 저장!
// (원본 저장 시 최단 경로가 바뀌는 과정에서 훼손 가능성이 높으니까)
    // 최단경로 상 '정점 저장'하는 배열
    Vertex ** ShortestPathVertices = (Vertex **) malloc( sizeof(Vertex) * G->VertexCount);

    // 최단 경로 연산 여부 저장(연산했다면 이 배열에 삽입)
    Vertex ** Fringes = (Vertex **) malloc( sizeof(Vertex) * G->VertexCount);

    // 최단 경로 상 정점의 선행 '정점 저장' 배열
    Vertex ** Precedences = (Vertex **) malloc (sizeof(Vertex) * G->VertexCount);

    // 시작 정점 삽입
    CurrentVertex = G->Vertices;

    // MST에 정점만 넣기 (간선 X)
    while ( CurrentVertex != NULL)
    {
        // 현재 정점에 추가
        Vertex * NewVertex = CreateVertex( CurrentVertex);
        AddVertex( ShortestPath, NewVertex);

        Fringes[i]     = NULL;
        Precedences[i] = NULL;
        ShortestPathVertices[i] = NewVertex;
        
        // [시작점 ~ 자신] 길이(최소 가중치 합)를 저장할 배열
        // 길이 무한대로 초기화
        Weights[i]     = MAX_WEIGHT; 

        // 일단 MST에 순서 무시하고 정점 인덱스 순으로 다 넣고
        // 그렇게 정의된 그래프에 가중치에 맞춰서 재삽입하면 되니까 
        CurrentVertex  = CurrentVertex->Next;
        i++;
        
    }

    // 본격적인 가중치에 따른 MST 정렬 시작
    // 정렬은 우선순위큐를 활용하여 MST를 오름차순 정렬할 거
    PQ_Enqueue ( PQ, StartNode );

    Weights[StartVertex->Index] = 0;

    while (! PQ_IsEmpty ( PQ ) )
    {
        PQNode Popped;

        PQ_Dequeue(PQ, &Popped);

        // 현재 정점 = 우선순위에서 Pop 시킨  "정점" 
        CurrentVertex = (Vertex*)Popped.Data;

        // 현재 정점은 최단 경로 연산 진행했음 표시
        Fringes[CurrentVertex->Index] = CurrentVertex;

        // 현재 간선 = 현재 정점의 간선 리스트 첫 요소
        CurrentEdge = CurrentVertex->AdjacencyList;
        while ( CurrentEdge != NULL )
        {
            // 간선 끝(목표) 정점 = 현재 최단인지 확인중인 간선의 끝 정점
            Vertex * TargetVertex = CurrentEdge->Target;

            // 현재 간선의 끝 정점이 아직 최단 경로 연산한 적 없는 정점이고
            // 시작~현재 정점까지 가중치 + 현재 간선의 가중치 < [시작 ~ 현재 간선 끝정점 가중치]
            // = 기존에 입력해둔 값(최초라서 무한대 or 갱신 필요)최단 거리가 아니라면
            if ( Fringes[TargetVertex->Index] == NULL && 
            Weights[CurrentVertex->Index] + CurrentEdge->Weight 
            < Weights[TargetVertex->Index])
            {
                // 해당 간선의 끝 정점을 최단거리로 삽입해야 한다
                PQNode NewNode = {CurrentEdge->Weight, TargetVertex};
                PQ_Enqueue (PQ, NewNode);

                // 해당 끝 정점의 최단 경로 선행 정점 갱신
                Precedences[TargetVertex->Index] = CurrentEdge->From;
                // 해당 끝 정점의 최단 경로 길이 갱신
                Weights[TargetVertex->Index] = Weights[CurrentVertex->Index] + CurrentEdge->Weight;
            }
            // 다음 탐색
            CurrentEdge = CurrentEdge->Next;
        }
    }

    // 각 정점이 최단거리로 연결된 MST 
    // 간선 생성-> 연결로 완성하기
    for (i = 0; i < G->VertexCount; i++)
    {
        int FromIndex, ToIndex;

        if (Precedences[i] == NULL)
            continue;
        // 현재 노드 i 로 가기위한 최단 경로 상 선행 정점 
        FromIndex = Precedences[i]->Index;

        // 현재 정점
        ToIndex   = i;

        AddEdge ( ShortestPathVertices[FromIndex], 
        CreateEdge(ShortestPathVertices[FromIndex], 
        ShortestPathVertices[ToIndex], Weights[i]));
    }

    free( Fringes );
    free( Precedences );
    free( ShortestPathVertices );
    free( Weights );

    PQ_Destroy( PQ );
}
    

