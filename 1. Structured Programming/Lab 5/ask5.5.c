#include <stdio.h>
#include <stdlib.h>
main() 
{
    /*
    MATHIMA: DOMHMENOSPROGRAMMATISMOS
    TMHMA: E4
    ERGASTHRIAKH ASKHSH: 5
    HMEROMHNIA: 08/11/2019
    ONOMA: VASILEIOS KYNDELEROS
    */
    
    int a, b, ab, p;
    
    printf("Dwse duo akeraies times a kai b: \n");
    scanf("%d %d", &a, &b);
    
    ab = a * b;
    
    printf(" %d * %d = %d\n", a, b, ab);
    p = 0;
    
    while (b > 0)
    {
        if( (b % 2) != 0)
        {
            p = p + a;
        }
        a = a * 2;
        b = b / 2;
        
        printf("a= %d b= %d p= %d\n", a, b ,p);
    }
    
    printf("Ginomeno: %d",p);
    printf("\n");

    
    system("Pause");     
}   
          
        
    
    
    

