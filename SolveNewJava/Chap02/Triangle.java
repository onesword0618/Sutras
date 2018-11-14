// 問題2-9
// 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成

import java.util.Scanner;

// 三角形の面積を求めて表示
class Triangle {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の面積を求める");

		System.out.print("底辺");
		double width = stdIn.nextDouble();

		System.out.print("高さ");
		double height = stdIn.nextDouble();

		// �ʐς����߂ĕ\��
		System.out.println("面積は" + (width * height / 2) + "です");
	}
}
