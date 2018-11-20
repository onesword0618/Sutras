//問題3-19 三つの整数値を読み込んで昇順にソートするプログラムを作成
import java.util.Scanner;

class Sort3 {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a:");
      int a = stdIn.nextInt();
    System.out.print("整数b:");
      int b = stdIn.nextInt();
    System.out.print("整数c:");
      int c = stdIn.nextInt();

    if(a > b) {
      int t = a;
      a = b;
      b = t;
    }

    if(b > c) {
      int t = b;
      b = c;
      c = t;
    }

    if(a > b) {
      int t = a;
      a = b;
      b = t;
    }

    System.out.println("a <= b <= c となるようにソートしました。");
    System.out.println("変数aは" + a + "です");
    System.out.println("変数bは" + b + "です");
    System.out.println("変数cは" + c + "です");
  }
}
