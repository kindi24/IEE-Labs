#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

main ()
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: 
    ERGASTHRIAKH ASKHSH: 6
    HMEROMHNIA: 
    ONOMA: 
    */
    
    int n, i;
    double npar;
    
    printf("Give a number between 1 and 10: ");
    scanf("%d", &n);
    
    while (n < 0 || n > 10)
    {
    	printf("Give a number between 1 and 10: ");
    	scanf("%d", &n);
	}
	
	//ASKHSH 4
		
	if (n == 0 || n == 1)
		npar = 1;
    else
	{
        npar = 1;
		for (i = 1; i <= n; i++)
		{
			npar = (double) npar * i;
		}
    }
	
	printf(" %d ! = %lf \n ", n, npar);
	
	
	//ASKHSH 5
	
	
	npar = 1;
		for (i = 2; i <= n; i++)
		{
			npar = (double) npar * i;
		}
	
	
	printf(" %d ! = %lf \n ", n, npar);
	
	system ("Pause");
	
}
	
	
	
	    
    
