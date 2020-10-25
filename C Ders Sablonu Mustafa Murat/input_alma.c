#include <stdio.h>
#define PI 3.14 // sabit deger
int main(){
	
	int yaricap; 
	float hacim;
	
	printf("Kurenin yaricapini giriniz");
	scanf("%d",&yaricap); // bunun sayeside bir input aliyoruz ve &tanimladigimiz degeri yazip kullanicini girmis oldugu degeri tanimladigimiz degere vermis olduk
	
	hacim = (4/3.0)*PI*(yaricap*yaricap*yaricap);
	
	printf("Kurenin hacmi %f dir",hacim);
	
	
	
	return 0;
}












