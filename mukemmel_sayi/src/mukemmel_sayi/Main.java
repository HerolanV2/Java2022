package mukemmel_sayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Sayı Giriniz:");
		Scanner sc = new Scanner(System.in);
		
		int sayi = sc.nextInt();
		int toplam=0;
		
		for(int i=1; i<=sayi; i++) {
			if(sayi%i==0) {
				toplam= toplam+i;
				if(toplam == sayi) {
					System.out.println("Mükemmel Sayıdır.");
				}

			}
		}

	}

}
