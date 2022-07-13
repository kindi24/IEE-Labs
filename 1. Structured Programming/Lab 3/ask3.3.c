#include <stdio.h>
#include <stdlib.h>
main ()
{
        
        int bar, age;
        double dms, yps;
        
        
        printf("Give baros: ");
        scanf ("%d", &bar);
        printf("Give ypsos in cm: ");
        scanf ("%lf", &yps);
        printf("Give age: ");
        scanf ("%d", &age);
        
        if (age >= 18)
        {
            yps = yps / 100;
            yps *= yps;
            
            dms = (double) bar / yps;  
            
            printf (" dms= %lf \n", dms); 	
            
			if (dms < 18.5)
                printf ("Adynato atomo\n"); 
            else if (dms < 25)
                printf ("Kanoniko atomo\n");
            else if (dms < 30)
                printf ("Vary atomo\n");
            else
                printf ("Ypervaro atomo\n");
        }
        else
            printf ("Den mporei na ipologisthei o deiktis dms\n");
        
        system ("Pause");                       
}        
        
