#include <stdio.h>

int main(){
	
	int islem;
	int bakiye = 1000;
	int tutar;
	
	printf("Islemler\n");
	
	printf("Islemi seciniz");
	scanf("%d",&islem);
	
	
	
	switch(islem){
		
		case 1:
			printf("Bakiyeniz %d\n",bakiye);
			printf("Cekilecek tutar");
			scanf("%d",&tutar);
			
			if (tutar > bakiye){
				printf("Bu kadar paran yok");
			}
			else{
				bakiye -= tutar;
			}
			printf("Bakiyeniz %d\n",bakiye);
			break;
		case 2:
			printf("Bakiyeniz %d\n",bakiye);
			printf("Yatiralacak tutar");
			scanf("%d",&tutar);
			
			bakiye += tutar;
			printf("Bakiyeniz %d\n",bakiye);
			break;
			
		case 3:
			printf("Bakiyeniz %d\n",bakiye);
			printf("Havale yapilacak tutar");
			scanf("%d",&tutar);
			
			if (tutar > bakiye){
				printf("Bu kadar paran yok");
			}
			else{
				bakiye -= tutar;
			}
			printf("Bakiyeniz %d\n",bakiye);
			break;
		case 4:
			printf("Bakiyeniz %d\n",bakiye);
			break;
		case 5:
			printf("Kart iade edildi\n");
			break;
		default:
			printf("Bilinmeyen islem");
			break;
		
		
		
		
	}
	
	
	return 0;
}












