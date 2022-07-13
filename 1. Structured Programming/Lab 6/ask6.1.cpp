#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

main ()
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: E4
    ONOMATEPONYMO: VASILEIOS KYNDELEROS
    HMEROMHNIA: 25/10/2019
    */
    
    int n;
    
    do{
    	printf("Give an integer in [1,10]: ");
    	scanf("%d", &n);
	}while(n < 1 || n > 10);
	
	for (int i = 1; i <= 10; i++){
		printf("%dx%d=%d  ", n, i, n * i);
	}
	
	printf("\n");
	system ("Pause");
	
}
	
	
