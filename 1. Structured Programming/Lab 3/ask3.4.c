#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, c, f, d, e;

    c = 101;

    printf("Dwse ton bathmo toy prwtoy bathmologiti (sta 100): ");
    scanf("%d", &a);

    printf("Dwse ton abthmo toy deyteroy bathmologiti (sta 100): ");
    scanf("%d", &b);

    if (a > b)
        d = a - b;
    else
        d = b - a;
    
    if (d > 20)
    {
        printf("H diafora > toy 20, dwse bathmo tritoy bathmologith : ");
        scanf("%d", &c);
    }
        
    if (c == 101)
        f = (a + b)/2;
    else
        f = (a + b + c)/3;

        e = f * 0.2;

    printf("O telikos bathmos einai : %d \n", e);
    system("Pause");
}

