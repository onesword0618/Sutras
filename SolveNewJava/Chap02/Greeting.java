// 問題2-１４
// キーボードから読み込んだ名前を元に挨拶するプログラムを作成
import java.util.Scanner;

class Greeting {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("姓"); String lastName = stdIn.next();
		System.out.print("名前"); String firstName = stdIn.next();

		System.out.print("こんにちは" + lastName + firstName + "さん");
	}
}
