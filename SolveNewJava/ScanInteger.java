// キーボードから読み込んだ整数値をそのまま反復して表示
import java.util.Scanner;

class ScanInteger {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		
		int x = stdIn.nextInt();	//xに整数値を読み込む
		
		System.out.println(x + "と入力しましたね。");	
	}
}