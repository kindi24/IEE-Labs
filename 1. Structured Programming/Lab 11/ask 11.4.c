#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : E4
ERGASTHRIAKH ASKHSH : 10
HMEROMHNIA : 13/12/2019
ONOMA : VASILEIOS KYNDELEROS
*/

typedef struct Ypallhlos
{
    char *Name; //Onoma
    int aM; //Arithmos Mhtwoy
    int eP; //Eidos Ptyxioy
    int wY; //Wres Yperories
    double bMis; //Basikos Misthos
    double tM; //Telikos Misthos
} ypallhlos;

 ypallhlos* gemismaPedion(char *name, int am, int ep, int wy, double bmis)
{
    ypallhlos *yp = (ypallhlos*)malloc(sizeof(ypallhlos));
    yp->Name = name;
    yp->aM = am;
    yp->eP = ep;
    yp->wY = wy;
    yp->bMis = bmis;

    return yp;
}

void emfanishPedion(ypallhlos *yp)
{
    printf("Name = %s\nAm = %d\nEidos Ptyxioy = %d\nWres Yperorias = %d\nBasikos Misthos = %lf\nTelikos Misthos = %lf\n\n", yp->Name, yp->aM, yp->eP, yp->wY, yp->bMis, yp->tM);
}


void emfanishPedionP(ypallhlos *yp, int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        printf("Name = %s\nAm = %d\nEidos Ptyxioy = %d\nWres Yperorias = %d\nBasikos Misthos = %lf\nTelikos Misthos = %lf\n\n", (yp + 1)->Name, (yp + i)->aM, (yp + i)->eP, (yp + i)->wY, (yp + i)->bMis, (yp + i)->tM);
    }
}


double returnTMisthos(ypallhlos *yp)
{
    double tmis;
    
    tmis = yp->bMis + (20 * yp->wY);
    
    switch(yp->eP)
    {
        case 1: tmis += 300;
                break;
                
        case 2: tmis += 150;
                break;
                
        case 3: tmis += 100;
                break;
                
        case 4: tmis += 50;
                break;
                
        default: tmis += 0;
    }
    return tmis;
}
    
void setTMall(int n, ypallhlos *ypp)
{
	int i;
	for(i = 0; i < n; i++)
		(ypp + i)->tM = returnTMisthos(ypp+1);
}

int returnfindMaxTM(ypallhlos *ypp, int n)
{
    int thesimax, i;
    double tmax;
    tmax = ypp->tM;
    thesimax = 0;
    
    for(i = 1; i < n; i++)
    {
        if(tmax < (ypp + 1)->tM)
        {
            tmax = (ypp + i)->tM;
            thesimax = i;
        }
    }
    
    return thesimax;
}

void swapYpiYpi1(ypallhlos *yp, int a)
{
    ypallhlos temp;
    
    temp = *(yp + a);
    *(yp + a) = *(yp + a + 1);
    *(yp + a + 1) = temp;
}

int main()
{
    int n, i, am, ep, wy;
    double bmis, tmis;
    ypallhlos *temp;
    
    do
    {
        printf("Give n <= 50 : ");
        scanf("%d", &n);
    }
    while( n > 50);
    
    ypallhlos *yp = (ypallhlos*)malloc(sizeof(ypallhlos)*n);
    printf("\n");
    
    for(i = 0; i < n; i++)
    {
        char *name = (char*)malloc(sizeof(40));
    	printf("Give Name of ypallhlos yp%d : ", i);
   	    scanf("%s", name);
    
 	   printf("Give Arithmos Mhtwoy of ypallhlos yp%d : ", i);
	    scanf("%d", &am);
    
	    printf("Give Eidos Ptyxiou of ypallhlos yp%d : ", i);
	    scanf("%d", &ep);
    
	    printf("Give Wres Yperories of ypallhlos yp%d : ", i);
	    scanf("%d", &wy);
    
	    printf("Give Basikos Misthos of ypallhlos yp%d : ", i);
  	    scanf("%lf", &bmis);
  	    temp = gemismaPedion(name, am, ep, wy, bmis);
        *(yp + i) = *temp;
        
  	    printf("\n");
    }
    
    setTMall(n, yp);
    
    emfanishPedionP(yp, n);
    
    printf("\n");
    
    int index;
   
    index = (rand() % ((n-2) - 0 +1));
    swapYpiYpi1(yp, index);
    
    emfanishPedionP(yp, n);
    
    
    int thesimax;
    
    printf("\n");
    
    thesimax = returnfindMaxTM(yp, n);
    printf(" TMmax exei o : \n");
    emfanishPedion(yp + thesimax);
    
    system("Pause");
}
