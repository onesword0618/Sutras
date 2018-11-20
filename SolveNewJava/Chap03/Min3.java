//問題3-1５ キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成

import java.util.Scanner;

class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a:");
		int a = stdIn.nextInt();

		System.out.print("整数b:");
		int b = stdIn.nextInt();

		System.out.print("整数c:");
		int c = stdIn.nextInt();

		int min = a;
		if (b <  min) min = b;
		if (c <  min) min = c;

		System.out.println("最小値は" + min + "です");
	}
}
