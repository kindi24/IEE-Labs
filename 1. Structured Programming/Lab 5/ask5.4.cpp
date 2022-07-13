#include <stdio.h>
#include <stdlib.h>
main() 
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: 
    ERGASTHRIAKH ASKHSH: 5
    HMEROMHNIA: 
    ONOMA: 
    */
    
    int a, PlT, PlA, PlX;
    PlT = 0;
    PlA = 0;
    PlX = 0;
    
    do{
    	printf("Dwse mia akeraia timh a: ");
    	scanf("%d", &a);
    	
    	if (a < 15 || a > 25){
    		if( (a % 2) == 0){
            	printf(" %d ^ 2 = %d\n", a, a*a);
        	}
        	if (a >= 0) PlT++;
        	if (a < 0) PlA++;
        	if (a >= 100 && a <= 200) PlX++;
		}
    	
	}while(a < 15 || a > 25);
        
    printf("Thetikoi: %d",PlT);
    printf("\n");
    
    printf("Arnhtikoi: %d",PlA);
    printf("\n");
    
    printf("Arithmoi sto [100,200]: %d",PlX);
    printf("\n");
    
    system("Pause");     
}   
          
        
    
    
    

