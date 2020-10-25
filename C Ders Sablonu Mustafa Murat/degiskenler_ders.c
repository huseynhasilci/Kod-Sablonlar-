#include <stdio.h>

int main(){
	
	int a1 = 42;
	char b1 = 66; // tam sayi ile karakter degeri aynidir.
	
	float c1 = 4.2;
	double d1 = 0.21;
	
	printf("%d %c %.1f %.2f %s\n",a1,b1,c1,d1,"Burasi string karakteri");// .1f dedigimizde noktadan sonra yalnizca 1 karakteri alir
	// %d int deger icin %c char karakter icin %f float ya da double deger icin %s de string deger icin
	printf("%d byte\n",sizeof(char));
	printf("%d byte\n",sizeof(int));
	printf("%d byte\n",sizeof(short int));
	printf("%d byte\n",sizeof(long int));
	printf("%d byte\n",sizeof(float));
	printf("%d byte\n",sizeof(double));
	
	
	return 0;
}



