#include <stdio.h>
#include <stdlib.h>

main ()
{
    /*
    MATHIMA: DOMHMENOS PROGRAMMATISMOS
    TMHMA: 
    ONOMATEPONYMO: 
    HMEROMHNIA: 
    */
    
    int mis;
    double uni, sos;
    
    printf("Dwse ton mistho: ");
    scanf(" %d", &mis);
    
    printf("\n");
    
    if (mis <= 800)
    {
        uni = mis * 0.04;
        sos = mis * 0.05;
        printf ("sos = %lf and unicef = %lf\n", sos, uni);
    }
    else if (mis < 1200)
    {
        uni = mis * 0.06;
        sos = mis * 0.075;
        printf ("sos = %lf and unicef = %lf\n", sos, uni);
    }
    else if (mis < 2000)
    {
        uni = mis * 0.08;
        sos = mis * 0.095;
        printf ("sos = %lf and unicef = %lf\n", sos, uni);
    } 
    else   
    {
        uni = mis * 0.11;
        sos = mis * 0.12;
        printf ("sos = %lf and unicef = %lf\n", sos, uni);
    }
    mis = mis - uni - sos;
    printf("\n");
    printf ("Telikos misthos = %d\n", mis);
    
    system("Pause");

}   
    
    
