#include<stdio.h>
#include <limits.h>

#define MAX_AMOUNT 10000

int min_coins(int coins[], int num_coins, int amount) {
    // DP 테이블 초기화: amount + 1 크기로 하고 무한대로 초기화
    int dp[MAX_AMOUNT + 1];
    for (int i = 0; i <= amount; i++) {
        dp[i] = INT_MAX;
    }
    dp[0] = 0;  // 0원을 거슬러주기 위한 화폐 개수는 0개
    
    // DP 테이블 채우기
    // dp = 현재 금액에 대하여 동전의 최소 개수 저장(특정 코인을 몇개 썼다 저장 X)
    for (int i = 1; i <= amount; i++) {
        for (int j = 0; j < num_coins; j++) {
            if (i - coins[j] >= 0 && dp[i - coins[j]] != INT_MAX) {
                if (dp[i] > dp[i - coins[j]] + 1) {
                    dp[i] = dp[i - coins[j]] + 1;
                }
            }
        }
    }
        
    // 결과 반환
    return dp[amount] == INT_MAX ? -1 : dp[amount];
}


int compare(const int* a, const int* b) {
	if (*a > *b) {
		return 1;
	}
	else {
		return -1;
	}
}


int main()
{
    int i;
    int coins[5] = {0};
    int num_coins = 0;
    int amount;
    int result;

    for (i = 0; i < 5; i++)
    {
        printf("[화폐 5개 입력]\n");
        printf("%d번째 화폐 종류를 입력해주세요(0 입력 시 화폐 입력 종료) : ", i);
        scanf("%d", &coins[i]);
        if (coins[i] == 0)
            break;
    }

    num_coins = i;
    qsort(coins, num_coins, sizeof(int), compare);
    for (i = 0; i <= num_coins; i++)
    {
        if (coins[i] != 0)
            {
                printf("화폐 %d번 : %d\n", i+1, coins[i]);
            }
    }
    
    while (1)
    {
        printf("손님에게 받은 금액(0원 입력 시 종료) : ");
        scanf("%d", &amount);
        if (amount != 0)
        {
            result = min_coins(coins, num_coins, amount);
            printf("거스름돈 개수 : %d\n", result);
            getchar();
            continue;
        }
        else
        {
            break;
        }
    }

    
    
    return 0;

}