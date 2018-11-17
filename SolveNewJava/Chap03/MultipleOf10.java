// 問題3-9
// 正の整数値を読み込んで、それが10の倍数であれば「その値は10の倍数です」と表示し、そうでなければ「その値は10の倍数でありません」と表示するプログラムを作成
// ※正でない値を読み込んだ場合は、「正でない値が入力されました」と表示すること
import java.util.Scanner;

class MultipleOf10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n > 0) {
			if (n % 10 == 0) {
					System.out.println("その値は10の倍数です");
			} else
					System.out.println("その値は10の倍数でありません");
			} else {
					System.out.println("正でない値が入力されました");
			}
		}
}
