// 読み込んだ整数値の絶対値を表示
import java.util.Scanner;
class Absolute1 {

	public static void main(String[] args){
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値:");
		int n = stdIn.nextInt();
		
		if (n >= 0)
			System.out.println("その絶対値は"+ n + "です。");
		else
		System.out.println("その絶対値は"+ (-n) + "です。");
	}
}