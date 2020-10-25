#include <stdio.h>


// pointerlar adres bilgisi tutuculari

int main(){
	
	
	int i = 5;
	
	int *p = &i; // bu sekilde pointer tanimlamis olduk int *p gibi
	
	printf("%p\n",p); // pointerimizim adresini buradan almis olduk ya da %u ile alabiliriz
	
	printf("%u\n",p);
	
	printf("%d",*p);// burada adrese git ve icindeki degeri al demils olduk * operatoru sayesinde
	
	
	// & degiskenin adres bilgisini veriyor
	// *  adresteki degeri verir
	
	
	//int j; 
	
	//scanf("%d",&j);// & ramdeki adres bilgisini almamiza yariyor
	
	
	
	return 0;
}















