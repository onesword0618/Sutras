// 問題3-6
// キーボードから読み込んだ整数値の符号を判定して表示するプログラムを作成せよ。

// 読み込んだ整数値の符号（正/負/０）を判定して表示
// 条件文を変更する
import java.util.Scanner;

class Sign2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = scn.nextInt();

		if (n > 0){
				System.out.println("その値は正です");
		} else if (n < 0) {
				System.out.println("その値は負です");
		} else if(n == 0){
				System.out.println("その値は０です");
		}
	}
}
