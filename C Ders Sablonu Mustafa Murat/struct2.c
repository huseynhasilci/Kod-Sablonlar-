#include <stdio.h>

struct Araba {
	
	int tekerleksayisi;
	int vitessayisi;
	int model;
	float motor;
	int beygir;
	
};



int main(){
	
	struct Araba araba1 = {4,5,1999,180.0,120};
	struct Araba araba2 = araba1;
	printf("%d %d %d %.2f %d",araba1.tekerleksayisi,araba1.vitessayisi,araba1.model,araba1.motor,araba1.beygir);
	
	return 0;
}
