#include <stdio.h>
#include <stdlib.h>

main()

{
		/*
	MATHIMA : DOMHMENOS PROGRAMMATISMOS
	TMHMA : E4
	ERGASTHRIAKH ASKHSH : 1
	HMEROMHNIA : 1/11/2019
	ONOMA : VASILEIOS KYNDELEROS
	*/
	
	int a,b;
	char praksh;
	printf("Dose praksh : ");
	scanf("%c",&praksh);
	printf("Dose 2 integers : ");
	scanf("%d %d", &a, &b);
	
	
		switch(praksh){
	
		case '+': printf("a + b = %d \n", a + b);
 		break;
	
		case '-': printf("a - b = %d \n", a - b);
    	break;
	
		case '*': printf("a * b = %d \n", a * b);
 		break;
	
		case '/': 
		if (b != 0) printf("a / b = %lf \n", a / b);
		else printf("Diairesh me mhden \n");
 		break;
	
		default: printf("Mh apodekth praksh \n");
	}
	

system ("Pause");

}
