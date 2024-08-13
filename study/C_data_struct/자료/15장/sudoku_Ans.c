#include <stdio.h>

int CheckBoxNum(int (*Box)[9], int currentcolumn, int currentrow, int currentnum);
void MakeBox(int (*Sudoku)[9], int (*Box)[9]);
int CheckPoint(int (*Sudoku)[9], int (*Box)[9], int currentcolumn, int currentrow);

int main() {
    int Sudoku[9][9] = {
        {0, 4, 7, 6, 0, 9, 0, 0, 0},
        {0, 2, 0, 0, 0, 0, 8, 0, 0},
        {5, 0, 0, 0, 1, 0, 0, 0, 7},
        {2, 0, 8, 4, 0, 3, 0, 1, 0},
        {4, 3, 6, 5, 2, 1, 9, 7, 8},
        {0, 1, 0, 7, 0, 6, 3, 0, 4},
        {1, 0, 0, 0, 7, 0, 0, 0, 3},
        {0, 0, 9, 0, 0, 0, 0, 4, 0},
        {0, 0, 0, 8, 0, 4, 6, 9, 0}
    };
    
    int Box[9][9];
    MakeBox(Sudoku, Box);
    CheckPoint(Sudoku, Box, 0, 0);
    
    return 0;
}

void MakeBox(int (*Sudoku)[9], int (*Box)[9]) {
    int i, j;
    for (int b = 0; b < 9; b++) { // Box 인덱스 초기화
        int k = 0;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if ((i / 3) * 3 + j / 3 == b) {
                    Box[b][k++] = Sudoku[i][j];
                }
            }
        }
    }
}

int CheckBoxNum(int (*Box)[9], int currentcolumn, int currentrow, int currentnum) {
    int BoxNum, i;

    if (currentcolumn < 3 && currentrow < 3)
        BoxNum = 0;
    else if (currentcolumn < 6 && currentrow < 3)
        BoxNum = 1;
    else if (currentcolumn < 9 && currentrow < 3)
        BoxNum = 2;
    else if (currentcolumn < 3 && currentrow < 6)
        BoxNum = 3;
    else if (currentcolumn < 6 && currentrow < 6)
        BoxNum = 4;
    else if (currentcolumn < 9 && currentrow < 6)
        BoxNum = 5;
    else if (currentcolumn < 3 && currentrow < 9)
        BoxNum = 6;
    else if (currentcolumn < 6 && currentrow < 9)
        BoxNum = 7;
    else if (currentcolumn < 9 && currentrow < 9)
        BoxNum = 8;    

    for (i = 0; i < 9; i++) {
        if (Box[BoxNum][i] == currentnum)
            return -1;
    }
    return 1;
}

int CheckPoint(int (*Sudoku)[9], int (*Box)[9], int currentcolumn, int currentrow) {
    int i, j;
    int AvailableNum[9] = {0};
    int AvNCnt = 0;
    int TempSudoku[9][9];
    
    for (i = 0; i < 9; i++) {
        for (j = 0; j < 9; j++) {
            TempSudoku[i][j] = Sudoku[i][j];
        }
    }

    if (currentrow == 9)
        return 0;

    if (TempSudoku[currentcolumn][currentrow] != 0) {
        if (currentcolumn == 8)
            return CheckPoint(TempSudoku, Box, 0, currentrow + 1);
        else
            return CheckPoint(TempSudoku, Box, currentcolumn + 1, currentrow);
    }

    for (i = 1; i <= 9; i++) {
        if (CheckBoxNum(Box, currentcolumn, currentrow, i) == 1) {
            AvailableNum[AvNCnt++] = i;
        }
    }

    for (i = 0; i < AvNCnt; i++) {
        TempSudoku[currentcolumn][currentrow] = AvailableNum[i];
        Box[(currentcolumn / 3) * 3 + currentrow / 3][currentcolumn % 3 * 3 + currentrow % 3] = AvailableNum[i];
        
        if (currentcolumn == 8) {
            if (CheckPoint(TempSudoku, Box, 0, currentrow + 1) == 0)
                return 0;
        } else {
            if (CheckPoint(TempSudoku, Box, currentcolumn + 1, currentrow) == 0)
                return 0;
        }

        // 값을 복구
        TempSudoku[currentcolumn][currentrow] = 0;
        Box[(currentcolumn / 3) * 3 + currentrow / 3][currentcolumn % 3 * 3 + currentrow % 3] = 0;
    }

    return -1;
}