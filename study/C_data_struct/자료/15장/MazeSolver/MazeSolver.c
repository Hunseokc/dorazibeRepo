#include "MazeSolver.h"

int Solve( MazeInfo* Maze )
{
    int i=0;
    int j=0;
    int StartFound = FAIL;
    int Result = FAIL;

    Position Start;

    // 순차탐색으로 시작점 찾기
    for ( i=0; i<Maze->RowSIze; i++ )
    {
        for ( j=0; j<Maze->ColumnSize; j++ )
        {
            if ( Maze->Data[i][j] == START )     
            {
                Start.X = j; // Column
                Start.Y = i; // Row
                StartFound = SUCCEED;
                break;
            }
        }
    }

    if ( StartFound == FAIL )
        return FAIL;    
    // 시작점 탐색 완료

    // 북부터 시행
    // 최초 이동이고 이후 이동은 MoveTo 내부에서 수행
    if ( MoveTo ( Maze, &Start, NORTH ) ) 
        Result = SUCCEED;
    else if ( MoveTo ( Maze, &Start, SOUTH ) ) 
        Result = SUCCEED;  
    else if ( MoveTo ( Maze, &Start, EAST  ) ) 
        Result = SUCCEED;  
    else if ( MoveTo ( Maze, &Start, WEST  ) ) 
        Result = SUCCEED;

    Maze->Data[Start.Y][Start.X] = START;

    return Result;
}

int MoveTo( MazeInfo* Maze, Position* Current, int Direction )
{
    int i=0;
    int Dirs[] = { NORTH, SOUTH, EAST, WEST };

    Position Next;

    // 현재 위치가 골이면 리턴
    if ( Maze->Data[Current->Y][Current->X] == GOAL )     
        return SUCCEED;

    // 현재 위치 visited 표시
    Maze->Data[Current->Y][Current->X] = MARKED;

    // 2, 3번 시행(가능 위치 탐색, 이동) 
    // 쉽게 생각하면 각 위치에서 4방향 탐색
    //  가능한 위치 있다면(북남까지 탐색해서 남 가능이면) 이동하여 4방향 탐색
    //  남 이동했는데 바로 막힘 -> 전으로 실행 흐름이 돌아와 남은 동서 확인
    for ( i=0; i<4; i++ )   // i < 4 = 북남동서 4 방향
    {
        // 현 위치에서 이동 가능한 위치 탐색 결과가 FAIL 이면 재시행
        // 아니면 i에 따라 북남동서 순으로 Next의 방향 갱신하고 밑의 MoveTo 시행
        if ( GetNextStep( Maze, Current, Dirs[i], &Next ) == FAIL )
            continue;
        
        // 어떤 다음 위치로 이동하던 북쪽 우선 탐색
        if ( MoveTo ( Maze, &Next, NORTH ) == SUCCEED )  
            return SUCCEED;
    }
    
    Maze->Data[Current->Y][Current->X] = WAY;

    return FAIL;
}

int GetNextStep( MazeInfo* Maze, Position* Current, int Direction, Position* Next )
{
    // 방향에 따른 이동구현
    // 각 if문의 return FAIL 은 벽에 닿았을 때
    switch ( Direction )
    {
    case NORTH:
        Next->X = Current->X;
        Next->Y = Current->Y - 1;

        if ( Next->Y == -1 ) return FAIL;

        break;
    case SOUTH:
        Next->X = Current->X;
        Next->Y = Current->Y + 1;

        if ( Next->Y == Maze->RowSIze ) return FAIL;

        break;
    case EAST:
        Next->X = Current->X + 1;
        Next->Y = Current->Y;        

        if ( Next->X == Maze->ColumnSize ) return FAIL;
        
        break;
    case WEST:
        Next->X = Current->X - 1;
        Next->Y = Current->Y;

        if ( Next->X == -1 ) return FAIL;
        
        
        break;
    }    
    
    if ( Maze->Data[Next->Y][Next->X] == WALL )     return FAIL;
    if ( Maze->Data[Next->Y][Next->X] == MARKED )   return FAIL;

    return SUCCEED;
}

int GetMaze( char* FilePath, MazeInfo* Maze )
{
    int i=0;
    int j=0;
    int RowSize    = 0;
    int ColumnSize = INIT_VALUE;

    FILE* fp;
    char  buffer[MAX_BUFFER];
    
    if ( (fp = fopen( FilePath, "r"))  == NULL )
    {
        printf("Cannot open file:%s\n", FilePath);
        return FAIL;
    }

    while ( fgets( buffer, MAX_BUFFER, fp ) != NULL )
    {
        RowSize++;

        if ( ColumnSize == INIT_VALUE )
        {
            ColumnSize = strlen( buffer ) - 1;
        }
        else if ( ColumnSize != strlen( buffer ) - 1 )
        {
            printf("Maze data in file:%s is not valid.\n", 
                FilePath);
            fclose( fp );
            return FAIL;
        }
    }

    Maze->RowSIze    = RowSize;
    Maze->ColumnSize = ColumnSize;
    Maze->Data = (char**)malloc(sizeof(char*) * RowSize );

    for ( i=0; i<RowSize; i++ )
        Maze->Data[i] = (char*)malloc(sizeof(char) * ColumnSize);

    rewind( fp );

    
    for ( i=0; i<RowSize; i++ )
    {
        fgets( buffer, MAX_BUFFER, fp );

        for ( j=0; j<ColumnSize; j++ )
        {
            Maze->Data[i][j] = buffer[j];
        }
    }

    fclose( fp );
    return SUCCEED;
}
