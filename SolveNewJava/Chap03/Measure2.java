// 問題3-4
// 二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です」と表示
// そうでなければ「BはAの約数ではありません」と表示するプログラムを作成する
// 条件分岐のバリエーション

import java.util.Scanner;

class Measure2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("変数A");
		int a = scn.nextInt();
		System.out.print("変数B");
		int b = scn.nextInt();

		if(!(a % b == 0)) {
			System.out.println("BはAの約数ではありません");
	}	else {
			System.out.println("BはAの約数です");
		}
	}
}
