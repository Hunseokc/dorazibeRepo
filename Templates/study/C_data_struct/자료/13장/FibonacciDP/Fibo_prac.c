#include<stdio.h>
#include<stdlib.h>

typedef unsigned long ULONG;

ULONG Fibo (int n)
{
    int result = 0;
    int i = 0;
    // 1. f(0), f(1) 초기값으로 지정
    // 2. if n < 2 -> 초기값 기반 연산하고 result return    
    // 3. n >= 3   -> 초기값으로 0+1, 1+2 ... n-1 + n-2까지 계산값 테이블에 저장 + 테이블 값 빼와서 다음꺼 더하고 저장 반복

    if (n == 0 || n == 1)
        return n;
    

    ULONG * Table = (ULONG*)malloc(sizeof(ULONG)*(n+1));  // f(5) 연산 => (f 0,1,2,3,4,5) -> 6개인거
    Table[0] = 0;
    Table[1] = 1;

    for (i = 2; i <= n; i++)
    {
        Table[i] = Table[i-1] + Table[i-2];
    }
    
    result = Table[n];
    free(Table);

    return result;

}

int main (void)
{
    int n;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    printf("Fibonacci(%d) = %lu\n", n, Fibo(n));
    return 0;
}