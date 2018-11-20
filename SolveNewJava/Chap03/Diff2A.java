//問題3-13 二つの整数値を読み込んでそれらの値のさを表示するプログラムを作成

import java.util.Scanner;

class Diff2A {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("整数a: ");
    int a = scn.nextInt();

    System.out.print("整数b: ");
    int b = scn.nextInt();

    int diff;

    if(a >= b) {
      diff = a - b;
    } else {
      diff = b - a;
    }
    System.out.println("それらの差は" + diff + "です");
  }
}
