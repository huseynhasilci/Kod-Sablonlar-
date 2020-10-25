#include <stdio.h>

int main(){
	
	int vize1,vize2,final;
	float uniort;
	float artort;
	
	printf("Vize 1 i giriniz: ");
	scanf("%d",&vize1);
	
	printf("Vize 2 i giriniz: ");
	scanf("%d",&vize2);
	
	printf("Finali giriniz: ");
	scanf("%d",&final);
	
	printf("Uni ort giriniz: ");
	scanf("%f",&uniort);
	
	artort = (vize1+vize2+final)/3.0;
	
	if (artort >90){
		printf("Harf notunuz AA ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=85 && artort <90){
		printf("Harf notunuz BA ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=80 && artort <85){
		printf("Harf notunuz BB ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=75 && artort <80){
		printf("Harf notunuz CB ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=70 && artort <75){
		printf("Harf notunuz CC ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=65 && artort <70){
		printf("Harf notunuz DC ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=60 && artort <65){
		printf("Harf notunuz DD ve Ders ortalamaniz: %f",artort);
	}
	else if(artort >=55 && artort <60){
		printf("Harf notunuz DF ve Ders ortalamaniz: %f",artort);
	}
	else{
		printf("Harf notunuz FF ve Ders ortalamaniz: %f kaldin amik kekosu",artort);
	}
	return 0;
}

























