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
	
	int month;
	printf("Dose mina : ");
	scanf("%d",&month);
	
	
	if (month <= 0) printf("Mh apodektos minas \n");
	else if (month >= 13) printf("Mh apodektos minas \n");
	else if (month <= 2) printf("Xeimwnas \n");
	else if (month <= 5) printf("Anoixh \n");
	else if (month <= 8) printf("Kalokairi \n");
	else if (month <= 11) printf("Fthinoporos \n");	
	else printf("Xeimwnas \n");

system ("Pause");

}
