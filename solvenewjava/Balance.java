// 読み込んだ2つの整数値の大小関係を表示
import java.util.Scanner;

class Balance {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("変数a:");
		int a = stdIn.nextInt();
		
		System.out.println("変数b:");
		int b = stdIn.nextInt();
		
		if(a > b)
		System.out.println("aのほうが大きいです。");
		else if (a < b)
		System.out.println("bのほうが大きいです。");
		else
		System.out.println("aとbは同じ値です。");
	}
}