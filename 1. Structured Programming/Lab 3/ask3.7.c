#include <stdio.h>
#include <stdlib.h>

main ()
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: E4
    ONOMATEPONYMO: VASILEIOS KYNDELEROS
    HMEROMHNIA: 25/10/2019
    */
    
    int typos, age, cyb, cost;
    
    printf("Dwse tin ilikia sou: ");
    scanf("%d", &age);
    
    printf("Dwse ton typo autokinitou sou: ");
    scanf("%d", &typos);
    
    printf("Dwse ta kyvika tou autokinitou: ");
    scanf("%d", &cyb);
    
    if (typos == 0)
    {
            if (cyb <= 1250)
                cost = 100; 
            else
                cost = 140;
    }
    else if (typos == 1)
    { 
        if (cyb <= 1400)
            cost = 400;
        else if (cyb <= 1800)
            cost = 500;
        else
            cost = 700;
    }
    
    else 
        printf ("Mi egkyros typos gia oxima");
    
    if (age >= 18 && age <= 24)
        cost = cost + (cost * 0.01);
    
    printf("\n");
    printf("costos =%d\n", cost);
    
    system("Pause");
    
}          
                                
