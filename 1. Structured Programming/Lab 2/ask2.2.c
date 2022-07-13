#include <stdio.h>
#include <stdlib.h>
main(){
	
	int n, apost, km, m, cm, yp;
	printf("Dwse tin timh N: ");
	scanf("%d", &n);
	
	apost = n * 80;
	
	printf("Apostasi = %d cm \n", apost);
	
	km = apost / 100000;
	yp = apost % 100000;
	
	m = yp / 100;
	cm = yp % 100;
	
	printf("%d km, %d m, %d cm \n", km, m, cm);
	
	system("Pause");
}

