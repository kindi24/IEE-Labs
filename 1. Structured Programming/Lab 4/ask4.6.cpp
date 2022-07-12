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
	
	if (month > 0 && month < 13){
		
		if (month == 1 || month == 2 || month == 12) printf("Xeimwnas \n");
		else if (month == 3 || month == 4 || month == 5) printf("Anoixh \n");
		else if (month == 6 || month == 7 || month == 8) printf("Kalokairi \n");
		else if (month == 9 || month == 10 || month == 11) printf("Fthinoporos \n");	
		
	} else printf("Mh apodektos minas \n");

system ("Pause");

}
