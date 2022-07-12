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
	
	
		switch(month){
	
		case 1:
		case 2:
		case 12: printf("Xeimwnas \n");
 		break;
 		
		case 3:
		case 4:
		case 5: printf("Anoixh \n");
    	break;
		
		case 6:
		case 7:
		case 8: printf("Kalokairi \n");
 		break;
	
		case 9:
		case 10:
		case 11: printf("Fthinoporos \n");
 		break;
	
		default: printf("Mh apodektos minas \n");
	}
	

system ("Pause");

}
