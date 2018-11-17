// 問題3-7
// 2つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
// 「aのほうが大きいです」「bのほうが大きいです」「aとbは同じ値です」
import java.util.Scanner;

class Balance {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("変数a:");
		int a = scn.nextInt();

		System.out.println("変数b:");
		int b = scn.nextInt();

	if(a > b) {
		System.out.println("aのほうが大きいです");
	} else if (a < b) {
		System.out.println("bのほうが大きいです");
	} else {
		System.out.println("aとbは同じ値です");
	}
 }
}
