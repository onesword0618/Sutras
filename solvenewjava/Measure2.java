// 読み込んだ整数値は約数であるかどうか(論理補数演算子)

import java.util.Scanner;

class Measure2 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("変数A：");
			int a = stdIn.nextInt();
		System.out.print("変数B：");
			int b = stdIn.nextInt();
		
		if(!(a % b == 0))
			System.out.println("BはAの約数ではありません。");
		else
			System.out.println("BはAの約数です。");	
	}
}