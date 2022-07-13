#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define nmax 100

/*
    MATHIMA : DOMHMENOS PROGRAMMATISMOS
    TMHMA : 
    ERGASTHRIAKH ASKHSH : 9
    HMEROMHNIA : 
    ONOMA : 
*/
void fill2DPin(int n, int p[][nmax])
{
    srand(time(0));
    int i, j;
    for( i = 0; i < n; i++)
    {
        for( j = 0; j < n; j++)
            p[i][j] = (rand() % 10 - 1)+1;
    }
}

void show2DPin(int n, int p[][nmax])
{
    int i, j;
    printf("p = \n");
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            printf(" %d ", p[j][i]);
        }
        printf("\n");
    }
}

void showPinDouble1D(int n, double p[])
{
    int i;
    for(i = 0; i < n; i++)
        printf("%.1lf ", p[i]);
}

void findMeanLine(int n, int p[][nmax], double avgline[])
{
    int i, j, sum;
    double avg;
    
    for(j = 0; j < n; j++)
    {
        sum = 0;
        for(i = 0; i < n; i++)
        {
            sum += p[i][j];
        }
        avg = (double)sum/n;
        avgline[j] = avg;
    }
}

void findMeanCol(int n, int p[][nmax], double avgcol[])
{
    int i, j, sum;
    double avg;
    
    for(i = 0; i < n; i++)
    {
        sum = 0;
        for(j = 0; j < n; j++)
        {
            sum += p[i][j];
        }
        avg = (double)sum/n;
        avgcol[i] = avg;
    }
}

int findDSum(int n, int p[][nmax])
{
    int i, j, sum;
    
    sum = 0;
    
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            if(i == j)
                sum += p[i][j];
            else if(i + j == n-1)   
                sum += p[i][j];
        }
    }
    return sum;
}

int main()
{
    int n;
    
    do
    {
        printf("Give an integer > 5 : ");
        scanf("%d", &n);
    }
    while(n <= 5);
    
    int p[n][nmax];
    
    fill2DPin(n, p);
    show2DPin(n, p);
    
    double avgline[n], avgcol[n];
    
    findMeanLine(n, p, avgline);
    findMeanCol(n, p, avgcol);
    
    printf("avgLine = ");
    showPinDouble1D(n, avgline);
    printf("\n");
    printf("avgCol = ");
    showPinDouble1D(n, avgcol);
    printf("\n");

    
    printf("SumD = %d\n", findDSum(n, p));
    
    system("Pause");
}
