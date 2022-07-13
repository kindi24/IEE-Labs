#include <stdio.h>
#include <stdlib.h>
main() 
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: 
    ERGASTHRIAKH ASKHSH:5
    HMEROMHNIA: 
    ONOMA: 
    */
    
    int num, i;
    double dyn;
    
    do
    {
        printf("Give a number between 2 and 10: ");
        scanf("%d", &num);
    }
    while(num < 2 || num > 10);
    
    dyn = (double) num;
    i = 1;
    
    printf("dynami = %d ^ %d = %lf\n", num, i, dyn);
    
    do
    {
        i = i + 1;
        dyn *= (double)num;
        printf("dynami = %d ^ %d = %lf\n",num , i, dyn);
    }
    while (dyn < 100);
    
    
    system ("Pause");

}     
