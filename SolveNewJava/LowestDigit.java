// キーボードから読み込んだ整数値の最下位桁を除いた値と最下位桁を表示
import java.util.Scanner;

class LowestDigit {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = stdIn.nextInt(); // xに整数値を読み込む
		
		System.out.println("最下位桁を除いた値は" + (x/10) + "です。");
		System.out.println("最下位桁は" + (x % 10) + "です。");
	}
}