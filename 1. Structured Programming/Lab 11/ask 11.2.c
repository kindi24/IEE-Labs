#include <stdio.h>
#include <stdlib.h>
#include <time.h>


/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : E4
ERGASTHRIAKH ASKHSH : 9
HMEROMHNIA : 06/12/2019
ONOMA : VASILEIOS KYNDELEROS
*/

void fillPin2D(int n, int m, int *p)
{
    int i, j;
    srand(time(0));
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m;j++)
        {
            *(p + i * n + j) = (rand() % 10 - 1 + 1) +1;
        }
    }
}

void showPin2D(int n, int m, int *p)
{
    int i, j;
    printf("p = \n");
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < m; j++)
        {
            printf(" %d ", *(p + i * n + j));
        }
        printf("\n");
    }
}

void showPinDouble1D(int n, double *p)
{
    int i;
    
    for(i = 0; i < n; i++)
        printf("%.3lf ", *(p + i));
}     

void findMeanLine(int n, int m, int *p, double *avg)
{
    int i, j, sum;

    for(i = 0; i < n; i++)
    {
        sum = 0;
        for(j = 0; j < m; j++)
        {
            sum += *(p + i * n + j);
        }
        *(avg + i) = (double)sum / n;
    }
}
       
void findMeanCol(int n, int m, int *p, double *avg)
{
    int i, j, sum;

    for(j = 0; j < m; j++)
    {
        sum = 0;
        for(i = 0; i < n; i++)
        {
            sum += *(p + i * n + j);
        }
        *(avg + j) = (double)sum / m;
    }
}

int findDSum(int n, int m, int *p)
{
    int i, j, sum;
    
    sum = 0;
    
    for(i = 0; i < n; i++)
    {
        sum += *(p + i * n + i);
        sum += *(p + i * n + (m-1));
    }
    return sum;
}

int main()
{
    int n, m, sumD;
    
    do
    {
        printf("Give an integer number > 1 : ");
        scanf("%d", &n);
        printf("Give an integer number > 1 : ");
        scanf("%d", &m);
    }
    while(n <= 1 || m <=1);
    
    int p[n][m];
    
    int *pp;
    
    pp = p;
    

    fillPin2D(n, m, pp);
    
        
    showPin2D(n, m, pp);
   
    double *pavgL, *pavgC;
    
    pavgL = (double*)malloc(sizeof(double) * n);
    pavgC = (double*)malloc(sizeof(double) * m);
        
    findMeanLine(n, m, pp, pavgL);
    findMeanCol(n, m, pp, pavgC);
    
    printf("avgLine = ");
    showPinDouble1D(n, pavgL);
    
    printf("\n");
    
    printf("avgCol = ");
    showPinDouble1D(m, pavgC);
    
    printf("\n");
    
    sumD = findDSum(n, m, pp);
    printf("sum = %d\n", sumD);
    
    system("Pause");
}
    
    
    
    
    
    
    
    


