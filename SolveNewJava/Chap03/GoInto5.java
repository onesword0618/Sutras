// 問題3-8
// 正の整数値を読み込んで、それが5で割り切れれば「その値は5で割り切れます」と表示し、そうでなければ「その値は5で割り切れません」と表示するプログラムを作成
// ※正でない値を読み込んだ場合は、「正でない値が入力されました」と表示すること
import java.util.Scanner;

class GoInto5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if(n > 0)
			if (n % 5 == 0)
				System.out.println("その値は5で割り切れます");
			else
				System.out.println("その値は5で割り切れません");
		else
			System.out.println("正でない値が入力されました");
	}
}
