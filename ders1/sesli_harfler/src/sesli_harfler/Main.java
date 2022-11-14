package sesli_harfler;
import java.lang.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char harf;
		Scanner sc= new Scanner(System.in);
		System.out.println("Harf Giriniz:\n");
		//https://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner
		harf = sc.next().charAt(0);
		//https://www.tutorialspoint.com/java/lang/character_touppercase.htm#:~:text=toUpperCase(char%20ch)%20converts%20the,that%20are%20symbols%20or%20ideographs.
		harf = Character.toUpperCase(harf);
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			default:
				//https://www.freecodecamp.org/news/java-operator-and-or-logical-operators/
				if(harf=='E'|| harf=='İ'|| harf=='Ö'|| harf=='Ü') {
					System.out.println("İnce Sesli Harf");
				}
				else {
					System.out.println("Sesli Harf Giriniz");
					return; 
				}
		}
	}

}
