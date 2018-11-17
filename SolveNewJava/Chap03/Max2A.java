// 問題3-12
// 二つの実数値を読み込んで、大きい方の値を表示するプログラムを作成せよ
import java.util.Scanner;

class Max2A {

	 public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

	 System.out.println("実数a:");
	 	double a = stdIn.nextDouble();
     System.out.println("実数b");
    	double b = stdIn.nextDouble();

	 double max;

	 	if (a > b) {
	 			max = a;
	 	} else {
	 			max = b;
		}
	 	System.out.println("大きいほうの値は"+ max + "です");
	 }
}
