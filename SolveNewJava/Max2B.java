// 読み込んだ二つの実数値の大きいほうの値を表示（その2：条件演算子）
import java.util.Scanner;

class Max2B {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数a:");
		double a = stdIn.nextDouble();
		System.out.print("実数b:");
		double b = stdIn.nextDouble();
	
		double max = a > b ? a : b;
		System.out.println("大きい方の値は" + max + "です。");
	}
}