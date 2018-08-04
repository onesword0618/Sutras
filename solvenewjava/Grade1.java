// 点数をもとに成績を判定(その1：　論理積演算子&&を利用)
import java.util.Scanner;

class Grade1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("点数：");
		int point = stdIn.nextInt();
		
		if (point >= 0 && point <= 59)
			System.out.println("不可");
		else if (point >= 60 && point <= 69)
			System.out.println("可");
		else if (point >= 70 && point <= 79)
			System.out.println("良");
		else if (point >= 80 && point <= 100)
			System.out.println("優");
		else
			System.out.println("不正な点数です。");
	}
}