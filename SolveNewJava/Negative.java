// 読み込んだ整数値は負の値か？
import java.util.Scanner;

class Negative {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");
		int n = stdIn.nextInt();
	
		if(n < 0)
		Sytem.out.prontln("その値は負です。");
	}
}