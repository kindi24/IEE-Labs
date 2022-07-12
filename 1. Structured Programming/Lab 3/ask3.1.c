#include <stdio.h> 
#include <stdlib.h>

main()
{
	int a, b, c;  
	
	printf("Give 3 integer numbers a, b, c \n");
	scanf("%d %d %d", &a, &b, &c);
	
	if  (a > b && b > c) 
	{
		printf(" a = % d > b = %d > c = %d \n", a, b, c);
    }
    
    else if (a > b && c > b && a > c)
    {
    	printf(" a = %d > c = %d > b = %d \n", a, c, b);
	}
	
	else if (a > b && c > a && c > b)
	{
		printf("c = %d > a = %d > b = %d \n", c, a, b);
	}
    
    else if (b > a && a > c)
    {
    	printf("b = %d > a = %d > c = %d \n", b, a, c);
	}
	
	else if (b > a && c > a && b > c)
	{
		printf(" b = %d > c = %d > a = %d \n", b, c, a);
	}
	
	else if (b > a && c > a && c > b)
	{
		printf(" c = %d > b = %d > a = %d \n", c, b, a);
	}

	
system ("Pause");
	
}
	
	
