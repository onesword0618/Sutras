// キーボードから読み込んだ値+-5の範囲の整数値をランダムに生成して表示
import java.util.Random;
import java.util.Scanner;

class RandomPlusMinus5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = stdIn.nextInt(); // xに整数値を読み込む
		
		System.out.println("その値の+-の乱数を生成しました。");
		System.out.println("値は" + (x -5 + rand.nextInt(11)) + "です。");
	}

}