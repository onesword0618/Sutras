// 問題2-15
// キーボードから読み込んだ住所を表示
import java.util.Scanner;

class Adress {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("住所");
		String adress = stdIn.nextLine();

		System.out.print("お住まいは" + adress + "ですね。");
	}
}
