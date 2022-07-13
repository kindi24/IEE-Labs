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
	
	for (int i = 1; i <= 10; i++){
		for(int j = 1; j <= 10; j++){
			printf("%dx%d=%d  ", i, j, i * j);
		}
		printf("\n");
	}
	
	system ("Pause");
	
}
