#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define nmax 50


struct ypallhlos
{
        char Onoma[50]; 
        int AM; // Arithmos Mitrvwou
        int eidos; // Eidos ptyxiou
        int yperwries;
        double misthos;
        double tmisthos;
} yp[50];        


/*
	MATHIMA : DOMHMENOS PROGRAMMATISMOS
	TMHMA : E4
	ERGASTHRIAKH ASKHSH : 10
	HMEROMHNIA : 22/11/2019
	ONOMA : VASILEIOS KYNDELEROS

*/

	 struct ypallhlos gemismapedion(char Onoma, int AM, int eidos, int yperwries, double misthos) 
	{    
       struct ypallhlos yp;
	   
	   strcpy(yp.Onoma, Onoma);
	   yp.AM = AM;
	   yp.misthos = misthos;
	   yp.eidos = eidos;
	   yp.yperwries = yperwries;
	   
	   return yp;
	}





int main ()
{
	
	    int n, AM, eidos, yperwries, i;
        double  misthos, tmisthos;
		char Onoma[n];
		
		do
		{
		printf("Give n <= 50: ");
		scanf("%d", &n);
		}
		while (n > 50);
		
		for (i = 0; i <= n; i++);
		{
			
		printf("\n");
		
		printf("Give name of yp[%d]: ", i);
		scanf("%s", &Onoma);
		
		printf("Give AM of yp[%d]: ", i);
		scanf("%d", &AM);
		
		printf("Give ptyxio of yp[%d]: ", i);
		scanf("%d", &eidos);

		printf("Give yperwries of yp[%d]: ", i);
		scanf("%d", &yperwries);
		
		printf("Give basikosMisthos of yp[%d]: ", i);
		scanf("%lf", &misthos);
		
		
        gemismapedion(Onoma, AM, eidos, yperwries, misthos);
	}
	
	
	
	system ("Pause");
}









