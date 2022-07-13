#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct ypallhlos
{
        char Onoma[50]; 
        int AM; // Arithmos Mitrvwou
        int eidos; // Eidos ptyxiou
        int yperwries;
        double misthos;
} yp1, yp2, temp;        


/*
	MATHIMA : DOMHMENOS PROGRAMMATISMOS
	TMHMA : 
	ERGASTHRIAKH ASKHSH : 10
	HMEROMHNIA : 
	ONOMA : 

*/


	 struct ypallhlos gemismapedion(char Onoma[], int AM, int eidos, int yperwries, double misthos) 
	{    
       struct ypallhlos yp;
	   
	   strcpy(yp.Onoma, Onoma);
	   yp.AM = AM;
	   yp.misthos = misthos;
	   yp.eidos = eidos;
	   yp.yperwries = yperwries;
	   
	   return yp;
	}
	
	
	void emfanishpedion(struct ypallhlos yp)
	{
		printf("Onoma: %s \n", yp.Onoma);
		printf("AM: %d \n", yp.AM);
		printf("Ptyxio: %d \n", yp.eidos);
		printf("Yperwries: %d \n", yp.yperwries);
		printf("Basikos misthos: %lf \n", yp.misthos);
	}
	
	
	void findTMisthos(struct ypallhlos yp1)
	{
		
		double TMisthos;
		TMisthos = yp1.misthos + (20 * yp1.yperwries);
		
		switch(yp1.eidos)
        {
            
		  case 1: TMisthos = TMisthos + 300;
		          break;
		          
		  case 2: TMisthos = TMisthos + 150;
		          break;
		  
		  case 3: TMisthos = TMisthos + 100;
		          break;
		  
		  case 4: TMisthos = TMisthos + 50;
		          break;
		  
		  default: printf("De dikaioutai epidoma ptyxiou \n");
		}
		
		
		printf("call findTmisthos() - Telikos misthos = %lf \n", TMisthos);  
		
    }	  
    
    	double returnTMisthos (struct ypallhlos yp2)
	{
		
		double TMisthos;
		TMisthos = yp2.misthos + (20 * yp2.yperwries);
		
		switch(yp2.eidos)
        {
            case 1: TMisthos = TMisthos + 300;
		        break;
		
		    case 2: TMisthos = TMisthos + 150;
		        break;
		
		    case 3: TMisthos = TMisthos + 100;
		        break;
		
		    case 4: TMisthos = TMisthos + 50;
		        break;
		
		    default: printf("De dikaioutai epidoma ptyxiou \n");
		    printf("\n");
		}
		
		
		return TMisthos;
		
    }	
	
	
	void findTMax(struct ypallhlos yp1, struct ypallhlos yp2)
	{
        double  TmisA, TmisB;
        TmisA = yp1.misthos;
        TmisB = yp2.misthos;
        
		if (TmisA > TmisB)
		{
			printf("TM yp1 = %lf > TM yp2 = %lf \n", TmisA, TmisB);
		}
		else if (TmisB > TmisA)
		{
			printf("TM yp2 = %lf > TM yp1 = %lf \n", TmisB, TmisA);  
		}
		else
		{
            printf("TM yp2 = %lf = TM yp1 = %lf \n", TmisB, TmisA);
        }    
 	} 
	 
	 
	 int swapYp1Yp2(struct ypallhlos ypA, struct ypallhlos ypB) 
	 {
	 	struct ypallhlos temp;

	 	temp = ypA;
	 	ypA = ypB;
	 	ypB = temp;
	 	
	}  
	
	
	int main()
	{
        int AM, eidos, yperwries;
        double  misthos, TMisthos;
		char Onoma[50];
        
        
        yp1 = gemismapedion("Ioannou", 2019087, 3, 22, 600);
		
		printf("ypallhlos yp1: \n");
		emfanishpedion(yp1);
		
		findTMisthos(yp1);
		
		printf("\n");
		
		printf("Give name of ypallhlos 2: ");
		scanf("%s", &Onoma);
		
		printf("Give AM of ypallhlos 2: ");
		scanf("%d", &AM);
		
		printf("Give ptyxio of ypallhlos 2: ");
		scanf("%d", &eidos);

		printf("Give yperwries of ypallhlos 2: ");
		scanf("%d", &yperwries);
		
		printf("Give basikosMisthos of ypallhlos 2: ");
		scanf("%lf", &misthos);
		
		printf("\n");
		
        yp2 = gemismapedion(Onoma, AM, eidos, yperwries, misthos);
		
		printf("ypallhlos yp2: \n");
		emfanishpedion(yp2);
		
		TMisthos = returnTMisthos(yp2);
		printf("Telikos misthos: %lf \n", TMisthos);
		printf("\n");
	
		findTMax(yp1, yp2);
		
		
		printf("\n");
		
		temp = yp1;
	 	yp1 = yp2;
	 	yp2 = temp;
		
		
		printf("ypallhlos yp1 after swap yp1 yp2: \n");
		emfanishpedion(yp1);
		
		printf("\n");
		
		printf("ypallhlos yp2 after swap yp1 yp2: \n");
		emfanishpedion(yp2);
		
		printf("\n");
		
		swapYp1Yp2(yp1, yp2);
		
		temp = yp1;
	 	yp1 = yp2;
	 	yp2 = temp;
		
		 printf("ypallhlos yp1 after call swapYp1Yp2(): \n");
		emfanishpedion(yp1);
		
		printf("\n");
		
		printf("ypallhlos yp2 after call swapYp1Yp2(): \n");
		emfanishpedion(yp2);
		
		printf("\n");
			
	
	system("Pause");
	
	}
	   
