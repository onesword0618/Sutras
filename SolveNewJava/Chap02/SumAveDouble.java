// 問題2-8
// 二つの実数値を読込、その和と平均を求めて表示するプログラムを作成
import java.util.Scanner;

// 二つの実数値を読み込んで合計と平均を表示
class SumAveDouble {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値");
		double x = stdIn.nextDouble();

		System.out.print("yの値");
		double y = stdIn.nextDouble();

		System.out.println("合計" + (x+y) + "です");
		System.out.println("平均" + (x+y) / 2 + "です");
	}
}
