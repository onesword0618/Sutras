// 姓と名を読み込んで挨拶
import java.util.Scanner;

class Greeting {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("姓："); String lastName = stdIn.next();
		System.out.print("名："); String firstName = stdIn.next();
		
		System.out.print("こんにちは" + lastName + firstName + "さん");
	}
}
