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
	
	for (int i = 1; i <= 10; i++){
		for(int j = 1; j <= 10; j++){
			printf("%dx%d=%d  ", i, j, i * j);
		}
		printf("\n");
	}
	
	system ("Pause");
	
}
