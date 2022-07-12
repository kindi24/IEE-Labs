#include <stdio.h>
#include <stdlib.h>
#include <math.h>


main() 
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: E4
    ERGASTHRIAKH ASKHSH: 5
    HMEROMHNIA: 08/11/2019
    ONOMA: VASILEIOS KYNDELEROS
    */
    
    int num, i;
    double dyn;
    
    printf("Give a number between 2 and 10: ");
    scanf("%d", &num);
    
    while (num < 2 || num > 10)
    {
    	printf("Give a number between 2 and 10: ");
        scanf("%d", &num);
    }
    
    dyn = (double)num;
    i = 0;
    
    while (dyn < 100)
    {
        i = i + 1;
        dyn = pow(num, i);
        
        printf("dynami = %d ^ %d = %lf\n", num, i, dyn);
    }
    
    system ("Pause");
    
}    
        
    
    
    
          
