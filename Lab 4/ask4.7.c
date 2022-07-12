#include <stdio.h>
#include <stdlib.h>
main()
{
	/*
	MATHIMA : DOMHMENOS PROGRAMMATISMOS
	TMHMA : ?_
	ERGASTHRIAKH ASKHSH : 1
	HMEROMHNIA : 1/11/2019
	ONOMA : VASILEIOS KYNDELEROS
	*/
	
	int arithmosAkinhtwn;
	double posoEisodhmatos, aforologhtoEisodhma, forologhteoEisodhma, forosPouAnalogei;
	
	printf ("Dwse to poso eisodimatos: ");
	
	scanf ("%lf", &posoEisodhmatos);
	
	printf ("Dwse ton arithmo akinitwn: ");
	
	scanf ("%d", &arithmosAkinhtwn);
	
	switch(arithmosAkinhtwn)
	{
	
	case 0: aforologhtoEisodhma = 12000;
 		break;
	
	case 1: aforologhtoEisodhma = 10000;
 		break;
	
	case 2: aforologhtoEisodhma = 8000;
 		break;
	
	case 3: aforologhtoEisodhma = 5000;
 		break;
	
	default: aforologhtoEisodhma = 0;
	}
	
	printf ("Aforologito eisodima: %lf \n", aforologhtoEisodhma);  
	
	if (posoEisodhmatos - aforologhtoEisodhma > 0)
	{
		forologhteoEisodhma = posoEisodhmatos - aforologhtoEisodhma;
		printf ("Forologiteo eisodima: %lf \n", forologhteoEisodhma);
	}
	else
	{
		forologhteoEisodhma = 0;
		printf ("Forologiteo eisodima: 0 \n");
	}	
	
	
	forosPouAnalogei = forologhteoEisodhma * 30/100; 
	printf ("Foros pou analogei: %lf \n", forosPouAnalogei);
	
	

system ("Pause");

}
	
