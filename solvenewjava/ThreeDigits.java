// 問題4-2:3桁の正の整数値（100〜999）を読み込むプログラムを作成せよ。
// 3桁の正の整数値でない値が入力された場合は、再入力させること。

import java.util.Scanner;

class ThreeDigits {

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    int x;
    do {
      System.out.print("3桁の正の整数値：");
      x = stdIn.nextInt();
    } while (x < 100 || x > 999);

    System.out.println(x + "と入力しましたね。");
  }
}
