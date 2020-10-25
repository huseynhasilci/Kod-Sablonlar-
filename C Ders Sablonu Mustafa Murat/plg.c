#include <stdio.h>
#include <math.h>
int main(){
	/*int a,b,c,d,e;
	
	float artimetik;
	
	printf("5 tane sayi giriniz"); 
	scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
	
	artimetik = (a+b+c+d+e)/5.0;
	
	printf("Girdiginiz sayilarin aritmetik ortalamasi %.2f",artimetik);
	*/
	
	
	int a,b,c;
	float x1,x2;
	float delta;
	printf("Denklemin asini giriniz: ");
	scanf("%d",&a);
	
	printf("Denklemin bsini giriniz: ");
	scanf("%d",&b);
	
	printf("Denklemin csini giriniz: ");
	scanf("%d",&c);	
	
	delta = b*b-4*a*c;
	x1 = (-b + (sqrt(delta)))/2*a;
	x2= (-b - (sqrt(delta)))/2*a;
	
	printf("Denklemin 1. koku %.2f",x1);
	printf("Denklemin 2. koku %.2f",x2);
	return 0;
}
















