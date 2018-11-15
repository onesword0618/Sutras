// 問題3-1
// 整数値を読み込んで、値が負であれば「その値は負です」と表示するプログラムを作成する
import java.util.Scanner;

// 読み込んだ整数値は負の値か？
class Negative {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("整数値:");
		int n = scn.nextInt();

		if(n < 0) {
			System.out.println("その値は負です");
		}
	}
}
