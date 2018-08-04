// 問題4-1:読み込んだ整数値の符号を判定して表示するプログラムに対して繰り返し処理を盛り込む

// 読み込んだ整数値の符号を判定して表示（好きなだけ繰り返せる）
import java.util.Scanner;

class SignRepeat {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    // 繰り返し？
    int retry;

    // 繰り返し
    do {
      System.out.print("整数値：");
      int n = stdIn.nextInt();

      if (n > 0) {
        System.out.println("その値は正です。");
      } else if (n < 0){
        System.out.println("その値は負です。");
      } else if (n == 0){
        System.out.println("その値は0です。");
      }

      // 入力メニュー
      System.out.print("もう一度？　1...YES/0...NO:");
        retry = stdIn.nextInt();
    } while (retry == 1);
  }
}
