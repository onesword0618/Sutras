// 問題3−17　2つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するプログラムを作成せよ。
// 2つの整数値が等しい場合は、『二つの値は同じです』と表示すること

import java.util.Scanner;
class MinMaxEq {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("整数a:");
    int a = stdIn.nextInt();
    System.out.print("整数b：");
    int b = stdIn.nextInt();

      int min = 0;
      int max = 0;
    if(a == b){
      System.out.println("二つの値は同じです");
    } else if (a < b) {
        min = a;
        max = b;
      } else {
        min = b;
        max = a;
      }

      System.out.println("小さい方の値は" + min + "です。" );
      System.out.println("大きい方の値は" + max + "です。" );
    }
  }
