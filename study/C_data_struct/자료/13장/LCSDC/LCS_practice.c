#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct structLCSTable
{
    int** Data;
} LCSTable;

int LCS( char* X, char* Y, int i, int j, LCSTable* Table )
{
    if (i == 0 || j == 0)  // 0이면 그냥 무조건 0 반환
    {
        Table->Data[i][j] = 0;
        return Table->Data[i][j];
    }
    else if (X[i-1] == Y[j-1]) // 마지막 같으면 +1로 치환 가능
    {
        Table->Data[i][j] = LCS(X, Y, i-1, j-1, Table) + 1;
        return Table->Data[i][j];
    }
    else              // 0아니고 마지막도 다르면 i-1, j vs i, j-1중 큰거 반환
    {
        int a = LCS(X, Y, i-1, j, Table);
        int b = LCS(X, Y, i, j-1, Table);
        if (a > b)
            Table->Data[i][j] = a;
        else
             Table->Data[i][j] = b;
        
        return Table->Data[i][j];
        
    }
}