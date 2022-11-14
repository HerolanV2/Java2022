package asalsayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int asal;
		boolean durum=false;
		System.out.println("sayı giriniz:");
		Scanner  sc = new Scanner(System.in);
		asal= sc.nextInt();
		System.out.println(asal);
		
		for(int i=2; i+1<asal; i++) {
			if(asal%i==0) {
				durum = true;
				System.out.println(i);
			}
			
		}
		if(durum==true) {
			System.out.println("asal değil");
		}
	}

}
