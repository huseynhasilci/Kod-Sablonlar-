#include <stdio.h>
#include <stdlib.h>

void kare(int *sonuc, int *can){// *can adreste gosterilen deger
	
	
	*sonuc = *can**can;
	
	
}



int main(){
	
	int x = 4;
	
	int sonucum;
	
	kare(&sonucum,&x);
	
	printf("%d",sonucum);
	
	return 0;
}


