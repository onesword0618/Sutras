// 住所を読み込んで反復表示。
import java.util.Scanner;

class Adress {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("住所："); 
		String adress = stdIn.nextLine();
		
		System.out.print("お住まいは" + adress + "ですね。");
	}
}
