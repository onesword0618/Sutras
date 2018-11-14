// 問題2-12
// キーボードから読み込んだ整数値プラスマイナス５をランダムに生成表示するプログラム
import java.util.Random;
import java.util.Scanner;

class RandomPlusMinus5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int x = stdIn.nextInt();

		System.out.println("その値をランダムに生成");
		System.out.println("値は" + (x -5 + rand.nextInt(11)) + "です。");
	}

}
