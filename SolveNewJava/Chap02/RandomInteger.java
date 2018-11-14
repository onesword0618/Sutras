// 問題2-11
// 以下に示すプログラムを作成
// 1桁の正の整数値をランダムに生成
// 1桁の負の整数値をランダムに生成
// 2桁の正の整数値をランダムに生成

import java.util.Random;

class RandomInteger {

	public static void main(String[] args) {

		Random rand = new Random();

		int n1 =  1 + rand.nextInt(9);
		int n2 = -1 + rand.nextInt(9);
		int n3 = 10 + rand.nextInt(90);

		System.out.println("３個の乱数を生成");
		System.out.println("1桁の正の整数" + n1);
		System.out.println("1桁の負の整数" + n2);
		System.out.println("2桁の正の整数" + n3);
	}
}
