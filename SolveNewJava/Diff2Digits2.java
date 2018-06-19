// 読み込んだ二つの整数値の差が10以下かどうかを表示(その2：条件演算子)
import java.util.Scanner;

class Diff2Digits2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = stdIn.nextInt();
		System.out.print("整数B：");
		int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b -a;
		
		System.out.println("それらの差は" + (diff <= 10 ? "10以下" : "11以上") + "です。");
	}
}
