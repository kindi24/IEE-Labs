#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : E4
ERGASTHRIAKH ASKHSH : 10
HMEROMHNIA : 13/12/2019
ONOMA : vASILEIOS KYNDELEROS
*/


 struct ypallhlos
{
    char *Name; //Onoma
    int aM; //Arithmos Mhtwoy
    int eP; //Eidos Ptyxioy
    int wY; //Wres Yperories
    double bMis; //Basikos Misthos
} ;

void gemismaPedion(char* name, int am, int ep, int wy, double bmis, struct ypallhlos *yp)
{
    
    yp->Name = name;
    yp->aM = am;
    yp->eP = ep;
    yp->wY = wy;
    yp->bMis = bmis;   
}

void emfanishPedion(struct ypallhlos *yp)
{
    printf("Name = %s\nAm = %d\nEidos Ptyxioy = %d\nWres Yperorias = %d\nBasikos Misthos = %lf\n", yp->Name, yp->aM, yp->eP, yp->wY, yp->bMis);
}

void findTMisthos(struct ypallhlos *yp)
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
                
        default: printf("De dikaioytai epidoma ptyxioy\n");
    }   
    
    printf("call findTMisthos() - Telikos misthos = %lf\n", tmis);
}

double returnTMisthos(struct ypallhlos *yp)
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
                
        default: printf("De dikaioytai epidoma ptyxioy\n");
    }
    
    return tmis;
}

void findMaxTM(struct ypallhlos *ypA, struct ypallhlos *ypB)
{
    double tmisA, tmisB;
    
    tmisA = returnTMisthos(ypA);
    tmisB = returnTMisthos(ypB);
    
    if( tmisA > tmisB)
        printf("TM yp1 = %lf > TM yp2 = %lf\n", tmisA, tmisB);
        
    else if(tmisA != tmisB)
        printf("TM yp2 = %lf > TM yp1 = %lf\n", tmisB, tmisA);
        
    else
        printf("TM yp1 = %lf = TM yp2 + %lf\n", tmisA, tmisB);
}

void swapYp1Yp2(struct ypallhlos *ypA, struct ypallhlos *ypB)
{    
    struct ypallhlos *temp;
    temp = ypA;
    ypA = ypB;
    ypB = temp;
}
    

int main()
{
    char* n = (char*)malloc(sizeof(40));
    int am, ep, wy;
    double bmis, tmis;
    struct ypallhlos *temp = (struct ypallhlos*)malloc(sizeof(struct ypallhlos));
    struct ypallhlos *yp1 = (struct ypallhlos*)malloc(sizeof(struct ypallhlos));
    struct ypallhlos *yp2 = (struct ypallhlos*)malloc(sizeof(struct ypallhlos));


    //Gia ton Ypallhlo yp1 :
    gemismaPedion("ioannou", 191234, 1, 7, 600.0, yp1);
    
    printf("Ypallhlos yp1 : \n");
    emfanishPedion(yp1);

    findTMisthos(yp1);
    
    printf("\n");
    
    //Gia ton Ypalhlo yp2 :
    printf("Give Name of ypallhlos yp2 : ");
    scanf("%s", n);
    
    printf("Give Arithmos Mhtwoy of ypallhlos yp2 : ");
    scanf("%d", &am);
    
    printf("Give Eidos Ptyxiou of ypallhlos yp2 : ");
    scanf("%d", &ep);
    
    printf("Give Wres Yperories of ypallhlos yp2 : ");
    scanf("%d", &wy);
    
    printf("Give Basikos Misthos of ypallhlos yp2 : ");
    scanf("%lf", &bmis);
    
    printf("\n");
     
    gemismaPedion(n, am, ep, wy, bmis, yp2);
    emfanishPedion(yp2);
    
    printf("\n");
    
    tmis = returnTMisthos(yp2);
    
    printf("call returnTMisthos() - Telikos Misthos = %lf\n", tmis);
    
    findMaxTM(yp1, yp2);
    
    printf("\n");
    
    temp = yp1;
    yp1 = yp2;
    yp2 = temp;
    
    printf("Ypallhlos yp 1 after swap : \n");
    emfanishPedion(yp1);
    
    printf("\n");
    
    printf("Ypallhlos yp 2 after swap : \n");
    emfanishPedion(yp2);
    
    printf("\n");
    
    swapYp1Yp2(yp1, yp2);
    
    printf("Ypallhlos yp 1 after call swapYp1Yp2 : \n");
    emfanishPedion(yp1);
    
    printf("\n");
    
    printf("Ypallhlos yp 2 after call swapYp1Yp2 : \n");
    emfanishPedion(yp2);
    
    system("Pause");
}
