// 読み込んだ整数値が正であれば3で割った余剰を表示 
import java.util.Scanner;

class Modulo3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値：");
		int n = stdIn.nextInt();
		
		if (n > 0)
			if (n % 3 == 0)
				System.out.println("その値は3で割り切れます。");
			else if (n % 3 == 1)
				System.out.println("その値を3で割った余りは1です。");
			else
				System.out.println("その値を3で割った余りは2です。");
		else
			System.out.println("正でない値が入力されました。");
	}
}