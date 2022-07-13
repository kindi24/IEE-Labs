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
    
    int n, dyn;
    int sum = 0;
    
    do{
    	printf("Give an integer in [5,20]: ");
    	scanf("%d", &n);
	}while(n < 5 || n > 20);
	
	for (int i = 1; i <= 2*n-1; i += 2){
		sum += i;
	}
	dyn = n * n;
	
	if(dyn == sum) printf("1+3+5+...+(2*%d-1)=%d=%d^2=%d \n", n, sum, n, dyn);
	else printf("Den einai isa \n");

	system ("Pause");
	
}
