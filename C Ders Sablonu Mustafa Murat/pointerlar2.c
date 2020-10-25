#include <stdio.h>

int main(){
	
	
	/*int a = 5,*ap;
	float b = 3.2,*bp;
	double c = 3.412,*cp;
	char d = 'a',*dp;
	int sayilar[5] = {1,2,3,4,5};
	
	int *arrayP;
	
	ap = &a;
	bp = &b;
	cp = &c;
	dp = &d;
	arrayP = &sayilar[1];
	
	
	printf("%p adresindeki intin degeri %d dir\n",ap,*ap);
	printf("%p adresindeki float degeri %f dir\n",bp,*bp);
	printf("%p adresindeki dobule degeri %lf dir\n",cp,*cp);
	printf("%p adresindeki char degeri %c dir\n",dp,*dp);
	printf("%p adresindeki sayilarin elemaninin degeri %d dir\n",arrayP,*arrayP);*/
	
	
	int i,j=1;
	
	int *jp1,*jp2 = &j;
	
	jp1 = jp2;
	
	i = ++(*jp2); // burada jp2nin bulundugu kutucugun degerini aldik 1 ve 1 arttirarak 2 ye esitledik i = 2 ve j de burada 2 oluyor  j=2
	
	*jp2 = *jp1 +i; // kutuya bu veriyi koyduk ve daha sonra jp1in icerisindeki degeri aldik ve 2 idi i ile topladik *jp2 = 4 oldu jp2 = 4 oldugu icin *jp1 de 4 oldu ayni kutucugun icerisinde bulunduklari icin ve j = 4 olmus oluyor
	
	printf("i = %d,j = %d,*jp1 = %d,*jp2 = %d ",i,j,*jp1,*jp2);
	
	
	
	
	return 0;
}














