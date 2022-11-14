package sayi_bulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] sayilar= new int[] {1,2,3,456,76,8,9};
		boolean durum = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Rakam Giriniz:");
		int girilen = sc.nextInt();
		for(int i = 0; i<sayilar.length;i++) {
			if(girilen==sayilar[i]) {
				durum=true;
			}
		}
		if(durum) {
			System.out.println("İçerde bu sayı var.");
		}
		else {
			System.out.println("Sayı bulunamadı.");
		}
	}

}
