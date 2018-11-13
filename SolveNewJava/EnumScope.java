// 問題4−4　2つの整数値を読み込んで、小さい方の数以上で大きいほうの数以下の全整数を小さいほうから順に表示するプログラムを作成せよ。

// 二つの整数間の整数を小さい方から順に表示
import java.util.Scanner;

class EnumScope {
  public static void main(String[] args) {
    // 入力値を生成する
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値A：");
    int a = stdIn.nextInt();
    System.out.print("整数値B："); 
    int b = stdIn.nextInt();

    if (a > b){
      int t = a;
      a = b;
      b = t;
    }

    do{
      System.out.print(a + " ");
      a = a + 1;
    } while (a <= b);
    System.out.println();
  }
}
