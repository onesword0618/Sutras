// 2つの実数値を読み込んで合計と平均を表示
import java.util.Scanner;

class SumAveDouble {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		
		System.out.println("合計は" + (x+y) + "です。");
		System.out.println("平均は" + (x+y) / 2 + "です。");
	}
}