#include <stdio.h>


void degerDegistir(int *a,int *b){
	
	int gecici = *a;
	
	*a = *b;
	*b = gecici; // ramdeki degerlerini pointerlar sayesinde degistirmis olduk
	
	
	
	
	
}





int main(){
	
	int  x = 5,y = 10;
	
	degerDegistir(&x,&y);// x ile ynin adresini gonderiyoruz
	
	printf("x: %d y:%d",x,y);
	
	return 0;
}
// buradaki kodda x ile y nin adresine gittik ve o adresteki degerleri onceden tanimladigimiz
// fonksiyonun icerisinde pointerlar ile adreslerini alip tutulduklari yerleri degistirdik
// tam anlamiyla bir degistirme uygulamis olduk
















