#include<stdio.h>
#include<stdlib.h>

void GetChange( int Price, int Pay, int CoinUnits[], int Change[], int Size )
{
    int i = 0;
    
    // 목표 거스름돈
    int ChangeAmount = Pay - Price;

    // 현재 거스름돈과 비교  ***** 중요 포인트 : 거스름돈 구하는 문제 X, 각 단위 Coin 개수 구하기 문제임!!! ****
    for (i = 0; i < Size; i++)
    {
        // i번째로 큰 화폐 몇 개 고를거임?
        Change[i] = CountCoins( ChangeAmount, CoinUnits[i]);
        
        // 해 검사
        // 현재 반복에서 거스름돈 = 기존 거스름돈 - (고른 화폐 * 개수)
        ChangeAmount = ChangeAmount - ( CoinUnits[i] * Change[i]);

        // i번째로 큰 화폐의 개수는 Change[] 에 인덱스대로 저장
    }
}

//                현재 거스름돈   지정한 화폐 종류
int  CountCoins( int Amount, int CoinUnit)
{
    int CoinCount = 0;
    int CurrentAmount = Amount;

    // 현재 거스름돈을 넘지 않는 지정한 화폐의 최대 개수 구하기 
    while ( CurrentAmount >= CoinUnit )
    {
        CoinCount++;
        CurrentAmount = CurrentAmount - CoinUnit;
    }

    // 해당 화폐의 최대 개수 반환
    return CoinCount;
}

void PrintChange( int CoinUnits[], int Change[], int Size )
{
    int i = 0;

    for (i = 0; i < Size; i++)
        printf("%8d원 : %d개\n", CoinUnits[i], Change[i]);   
}

