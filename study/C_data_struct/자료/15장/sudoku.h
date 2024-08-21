#ifndef SUDOKU_H
#define SUDOKU_H



#define MAX_BUFFER 1024
#define INIT_VALUE -1

enum RESULT    { FAIL, SUCCEED }; 

typedef struct tagPosition
{
    int X;
    int Y;
} Position;

typedef struct tagSudokuInfo
{
    int ColumnSize; // 너비
    int RowSIze;    // 높이

    int ** Data;    // 동적으로 할당한 2차원 배열을 담기 위한 2차원 포인터
} SudokuInfo;


SudokuInfo MakeSudoKu()

#endif
