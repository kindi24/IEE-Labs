#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

/*
    MATHIMA : DOMHMENOS PROGRAMMATISMOS
    TMHMA : E4
    ERGASTHRIAKH ASKHSH : 78
    HMEROMHNIA : 22/11/2019
    ONOMA : VASILEIOS KYNDELEROS
*/

void fillPin(int n, int p)
{
    int i;
    for(i = 0; i < n; i++)
        (p + i) = (rand() % 10) + 1;
}

void showPin(int n, int *p)
{
    int i;
    for( i = 0; i < n; i++)
        printf("p[%d] = %d\n", i, *(p + i));
}

int max(int n, int *p)
{
    int i, tmax;
    tmax = *p;
    for(i = 1; i < n; i++)
    {
        if(tmax < *(p + i))
            tmax = *(p + i);
    }
    
    return tmax;
}

int min(int n, int *p)
{
    int i, tmin;
    tmin = *p;
    for(i = 1; i < n; i++)
    {
        if(tmin > *(p + i))
            tmin = *(p + i);
    }
    
    return tmin;
}

int findThesiMax(int n, int *p)
{
    int i, thesi;
    thesi = 0;
    for(i = 0; i < n; i++)
    {
        if(*(p + i) == max(n, p))
            thesi = i;
    }
    return thesi;
}

int findThesiMin(int n, int *p)
{
    int i, thesi;
    thesi = 0;
    for(i = 0; i < n; i++)
    {
        if(*(p + i) == min(n, p))
            thesi = i;
    }
    return thesi;
}

double avg(int n, int *p)
{
    int i, sum;
    double dmo;
    sum = 0;
    for(i = 0; i < n; i++)
        sum += *(p + i);
    
    dmo = (double)sum/(n-1);
    
    return dmo;
}

int countavg(int n, int *p)
{
    int i, j;
    
    j = 0;
    
    for( i = 0; i < n; i++)
    {
        if(*(p + i) > avg(n, p))
            j++;
    }
    
    return j;
}

int searchPThesiNum(int n, int *p, int num)
{
    int i, tnum;
    tnum = -1;
    for( i = 0; i < n; i++)
    {
        if( *(p + i) == num)
        {
            tnum = i;
            break;
        }
    }
    return tnum;
}

void bubbleDesc(int n, int *p)
{
    int i, j, temp;
    
    for(i = 0; i < n; i++)
    {
        for( j = 0; j < n - i - 1; j++)
        {
            if(*(p + j) < *(p + j + 1))
            {
                temp = *(p + j);
                *(p + j) = *(p + j + 1);
                *(p + j + 1) = temp;
            }
        }
    }
}

int binarysearchPThesinum(int n, int *p, int num)
{
    int beg, end, thesi, mid;
    bool found;
    beg = 0;
    end = n-1;
    thesi = -1;
    found = false;
    while(beg <= end && !found)
    {
        mid = (beg + end)/2;
        if( *(p + mid) == num)
        {
            thesi = mid;
            found =  true;
        }
        else
        {
            if(*(p + mid) > num)
                beg = mid + 1;
            else
                end = mid - 1;
        }
    }
    return thesi;
}

void swapPin(int n, int *p, int a, int b)
{
	int temp, i;
	
	for(i = 0; i < n; i++)
	{
		if(i == a)
		{
			temp = *(p + a);
			*(p + a) = *(p + b);
			*(p + b) = temp;
		}
	}
}
    
        

int main()
{
    int n, num, thesinum;
    do
    {
        printf("Give an integer > 5 : ");
        scanf("%d", &n);
    }
    while( n <= 5);
    
    int p[n];
    
    int *pp;
    
    pp = (int*)malloc(sizeof(int) * n);
    fillPin(n, pp);
    showPin(n, pp);
    printf(" max  = %d in position thesimax = %d\n", max(n, pp), findThesiMax(n, pp));
    printf(" min  = %d in position thesimin = %d\n", min(n, pp), findThesiMin(n, pp));
    
    printf(" avg = %lf\n", avg(n, pp));
    printf(" countavg = %d\n", countavg(n, pp));
    
    bool found;
    
    printf("Give an integer number : ");
    scanf("%d", &num);
    
    thesinum = searchPThesiNum(n, pp, num);
    
    if(thesinum != -1)
        printf("Found num = %d in position %d\n", num, thesinum);
    else
        printf("num = %d NOT FOUND\n", num);
    
    bubbleDesc(n, pp);
    showPin(n, pp);
    
    printf("Give an integer number : ");
    scanf("%d", &num);
    
    thesinum = binarysearchPThesinum(n, pp, num);
    if(thesinum != -1)
        printf("num = %d found on position %d\n", num, thesinum);
    else
        printf("num = %d NOT FOUND\n", num);
        
    int index;
    index = (rand() % (n-2));
    
    printf("index = %d\n", index);
    
    swapPin(n, pp, index, index + 1);
    
    showPin(n, pp);
        
    system("Pause");
}

    

    

        
    

