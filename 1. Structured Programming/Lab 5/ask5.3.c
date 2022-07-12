#include <stdio.h>
#include <stdlib.h>
main() 
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: E4
    ERGASTHRIAKH ASKHSH: 5
    HMEROMHNIA: 08/11/2019
    ONOMA: VASILEIOS KYNDELEROS
    */
    
    int xor, pl, sum, sumEp, Epit;
    
    pl = 0;
    sum = 0;
    sumEp = 0;
    
    
    do
    {
        printf("Dwse ton arithmo xwritikothtas: ");
        scanf("%d", &xor);
        
        pl = pl + 1;
        sum = sum + xor;
        
        if (xor <= 15)
        {
            Epit = 1;
        }    
        else if (xor <= 23)
        {
            Epit = 2;
        }
        else
        {
            Epit = 3;
        }
            
        printf ("Arithmos epitiritwn = %d \n", Epit);
        sumEp = sumEp + Epit;
        
    }
    while (sum <= 100);
    
    printf("\n");
    
    printf ("Arithmos aitouswn: %d \n", pl);
    printf ("Arithmos epitiritwn: %d \n",sumEp);
    printf ("Arithmos thesewn: %d \n", sum);
    

   system ("Pause"); 
}
            
            
            
      

    
