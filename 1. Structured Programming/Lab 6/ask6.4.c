#include <stdio.h>
#include <stdlib.h>


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
    
    printf("Give a number between 0 and 10: ");
    scanf("%d", &n);
    
    while (n < 0 || n > 10)
    {
    	printf("Give a number between 0 and 10: ");
    	scanf("%d", &n);
	}
	
	npar = 1;
		for (i = 2; i <= n; i++)
		{
			npar = (double) npar * i;
		}
	
	
	printf(" %d ! = %lf \n", n, npar);
	
	system ("Pause");
	
}
