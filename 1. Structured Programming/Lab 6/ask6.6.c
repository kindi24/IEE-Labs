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
    
    int n, npar, i;
    bool protos;
    
       printf("Give a number between 0 and 10: ");
    	scanf("%d", &n);
    
    while (n < 0 || n > 10)
    {
    	printf("Give a number between 0 and 10: ");
    	scanf("%d", &n);
	}
	
	npar = 1;
		
	if (n != 0 || n != 1);
		for (i = 1; i <= n; i++)
		{
			npar = npar * i;
		}
	
	
	printf(" %d ! = %d \n", n, npar);
	printf("\n");
    
    printf("Give a number between 2 and 100: ");
    scanf("%d", &n);
    
    while (n < 2 || n > 100)
    {
    	printf("Give a number between 2 and 100: ");
    	scanf("%d", &n);
	}
	
	
	
	for (i = 2; i <= n/2; i++)
	{
		protos = true;
		if (n % i == 0)
		{
			protos = false;
		}
    }
		
		if (protos == true)
		{
			printf("n = %d einai Prwtos \n", n);
		}
		else
		{
			printf("n = %d den einai Prwtos \n", n);
		}
		
	
	
	system("Pause");
	
}
	
	
	
