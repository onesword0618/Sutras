// 問題2-5
// キーボードから読み込んだ整数値をそのまま反復して表示するプログラム
import java.util.Scanner;

class ScanInteger {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値");

		int x = stdIn.nextInt();

		System.out.println(x + "入力しましたね。");
	}
}
