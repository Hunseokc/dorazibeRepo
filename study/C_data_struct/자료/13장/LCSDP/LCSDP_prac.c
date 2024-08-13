#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct structLCSTable
{
    int** Data;
} LCSTable;

int LCS( char* X, char* Y, int i, int j, LCSTable* Table )
{
    int m = 0;
    int n = 0;

    for (m = 0; m <= i; m++)
    {
        Table->Data[m][0] = 0;
    }

    for (n = 0; n <= j; n++)
    {
        Table->Data[0][n] = 0;
    }

    for (m = 1; m <= i; m++)
    {
        for (n = 1; n <= j; n++)
        {
            if (X[m-1] == Y[n-1])
                Table->Data[m][n] = (Table->Data[m-1][n-1])+1;
            else
                Table->Data[m][n] = (Table->Data[m-1][n] > Table->Data[m][n-1]) ? Table->Data[m-1][n] : Table->Data[m][n-1];
        } 
    }

    return Table->Data[i][j];
}

void LCS_TraceBack( char* X, char* Y, int m, int n, LCSTable* Table, char* LCS)
{
    // 종료 조건은 i = 0 or j = 0
    if ( m == 0 || n == 0 )
        return;
    
    // 2번 조건 : 현재 값이 주변 모든 탐색 대상 칸보다 더 큼
    if ( Table->Data[m][n] > Table->Data[m][n-1] 
         && Table->Data[m][n] > Table->Data[m-1][n]
         && Table->Data[m][n] > Table->Data[m-1][n-1] )
    {
        char TempLCS[100];
        strcpy(TempLCS, LCS);
        sprintf(LCS, "%c%s", X[m-1], TempLCS);

        LCS_TraceBack(X,Y,m-1, n-1, Table, LCS);
    }
    // 3번 조건 : 현재 값 > 왼, 현 값 == 위
    else if (Table->Data[m][n] > Table->Data[m-1][n] &&
        Table->Data[m][n] == Table->Data[m][n-1])
        LCS_TraceBack(X, Y, m-1, n, Table, LCS);
    else
        LCS_TraceBack(X, Y, m-1, n, Table, LCS);
}

void LCS_PirntTable (LCSTable * Table, char * X, char * Y, int LEN_X, int LEN_Y)
{
    int i, j;
    printf("%4s", "");

    for (i = 0; i < LEN_X+1; i++)
    {
        printf("%c", X[i]);
    }
    printf("\n");

    for (i = 0; i < LEN_Y+1; i++)
    {
        if (i == 0)   
            printf("%2s", "");
        else
            printf("%-2c", Y[i-1]);
        
        for (j = 0; j < LEN_Y+1; j++)
        {
            printf("%d", Table->Data[i][j]);
        }
        printf("\n");
    }
}

int main ()
{
    char * X = "GOOD MORNING.";
    char * Y = "GUTEN MORGEN.";
    char * Result;
    LCSTable Table;

    int LEN_X = strlen(X);
    int LEN_Y = strlen(Y);

    int i = 0;
    int Length = 0;

    Table.Data = (int**)malloc( sizeof(int) * (LEN_X + 1));
    
    for (i = 0; i < LEN_X+1; i++)
    {
        Table.Data[i] = (int**)malloc( sizeof(int) * (LEN_Y + 1));
        memset(Table.Data[i], 0, sizeof(int) * (LEN_Y + 1));
    }
    
    

}