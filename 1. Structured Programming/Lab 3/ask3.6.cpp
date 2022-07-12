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
    
    int pro, varos;
    double cost;
    
    printf("Dwse to varos se grammaria: ");
    scanf("%d", &varos);
    
    printf("Dwse ton proorismo ths epistolhs: ");
    scanf("%d", &pro);
    
    if (pro == 0)
    {
            if (varos <= 500)
                cost = 2.0; 
            else if (varos <= 1000)
            	cost = 3.5;
            else
                cost = 4.6;
    }
    else if (pro == 1)
    { 
         if (varos <= 500)
            cost = 4.8; 
        else if (varos <= 1000)
            cost = 7.2;
        else
            cost = 11.5;
    }
    else printf("Mi egkiros proorismos epistolhs");
    
    printf("\n");
    printf("costos = %lf\n", cost);
    
    system("Pause");
    
}          
