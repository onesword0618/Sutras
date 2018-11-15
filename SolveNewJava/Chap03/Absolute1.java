// 問題3-2
// 整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ
import java.util.Scanner;

// 読み込んだ整数値の絶対値を表示
class Absolute1 {

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		System.out.println("整数値:");
		int n = scn.nextInt();

		if (n >= 0) {
				System.out.println("その絶対値は"+ n + "です");
		} else {
				System.out.println("その絶対値は"+ (-n) + "です");
		}
	}
}
