#include <stdio.h>
#include <stdlib.h>
main(){

	int i1, i2, isum;
	double dsum, dmo;
	
	i1 = 6;
	i2 = 5;
	
	isum = i1 + i2;
	dmo = isum / 2;	
	
	dsum = i1 + i2;
	dmo = dsum / 2;
	
	//Extra
	
	short s1, s2, ssum;
	
	s1 = 6;
	s2 = 5;
	
	ssum = s1 + s2;
	dmo = ssum / 2;
	
	printf("short s1 = %d, s2 = %d, ssum = %d, dmo = %lf \n", s1, s2, ssum, dmo);
	
	dsum = s1 + s2;
	dmo = dsum / 2;
	
	printf("short s1 = %d, s2 = %d, dsum = %lf, dmo = %lf \n", s1, s2, dsum, dmo);
	
	
	printf("int i1 = %d, i2 = %d, isum = %d, dmo = %lf  \n", i1, i2, isum, dmo);
	printf("int i1 = %d, i2 = %d, dsum = %lf, dmo = %lf \n", i1, i2, dsum, dmo);
		
	
	long l1, l2, lsum;
	
	l1 = 6;
	l2 = 5;
	
	lsum = l1 + l2;
	dmo = lsum / 2;

	printf("long l1 = %ld, l2 = %ld, lsum = %ld, dmo = %lf \n", l1, l2, lsum, dmo);
	
	dsum = l1 + l2;
	dmo = dsum / 2;
	
	printf("long l1 = %ld, l2 = %ld, dsum = %lf, dmo = %lf \n", l1, l2, dsum, dmo);
	
	
	float f1, f2, fsum;
	
	f1 = 6;
	f2 = 5;
	
	fsum = f1 + f2;
	dmo = fsum / 2;
	
	printf("float f1 = %f, f2 = %f, fsum = %f, dmo = %lf \n", f1, f2, fsum, dmo);
	
	dsum = f1 + f2;
	dmo = dsum / 2;
	
	printf("float f1 = %f, f2 = %f, dsum = %lf, dmo = %lf \n", f1, f2, dsum, dmo);
	
	double d1, d2;
	
	d1 = 6;
	d2 = 5;	
	
	dsum = d1 + d2;
	dmo = dsum / 2;
	
	printf("double d1 = %lf, d2 = %lf, dsum = %lf, dmo = %lf \n", d1, d2, dsum, dmo);
	
	
	system("Pause");
}

