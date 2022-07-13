#include <stdio.h>
#include <stdlib.h>

main()

{
		/*
	MATHIMA : DOMHMENOS PROGRAMMATISMOS
	TMHMA : 
	ERGASTHRIAKH ASKHSH : 4
	HMEROMHNIA : 
	ONOMA : 
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
