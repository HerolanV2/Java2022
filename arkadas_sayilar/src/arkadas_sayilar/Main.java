package arkadas_sayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi1;
		int sayi2;
		int toplam1=0;
		int toplam2=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sayı:");
		sayi1= sc.nextInt();
		System.out.println("2. Sayı:");
		sayi2= sc.nextInt();
		
		for(int i=1; i<sayi1; i++) {
			if(sayi1%i==0) {
				toplam1= toplam1+i;
			}
			
		}
		for(int i=1; i<sayi2; i++) {
			if(sayi2%i==0) {toplam2= toplam2+i;
			}
		}
		if(sayi1==toplam2 || sayi2==toplam1) {
			System.out.println("Arkadaş Sayılardır.");
		}
	}
}