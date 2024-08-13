#include <stdint.h>

int fibonacci(int n) {
    int a = 0, b = 1, c, i;
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

int main(void)
{
    int a = 10; // 예시로 10번째 피보나치 수를 계산
    int result = fibonacci(a);
    // 결과 출력
    printf("Fibonacci(%d) = %d\n", a, result);
    
    return 0;
}