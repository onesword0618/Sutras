//問題3-18 二つの整数値を読み込んで昇順にソートするプログラムを作成
import java.util.Scanner;

class Sort2Descending {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a:");
      int a = stdIn.nextInt();
    System.out.print("整数b:");
      int b = stdIn.nextInt();

    if (a < b) {

      int i = a;
      a = b;
      b = i;  
    }

    System.out.println("a>=bとなるようにソートしました。");
    System.out.println("変数aは" + a + "です");
    System.out.println("変数bは" + b + "です");
  }
}
