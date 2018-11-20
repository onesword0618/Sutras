//問題3-14 二つの整数値を読み込んでそれらの値の差が１10以下であれば、「それらの差は10以下ですよ」と表示。
//そうでなければ、それらの値は１１以上ですと表示されるプログラムを作成
import java.util.Scanner;

class Diff2Digits1 {

  public static void main(String[] args) {

      Scanner stdIn = new Scanner(System.in);

      System.out.print("整数a:");
      int a = stdIn.nextInt();
      System.out.print("整数b:");
      int b = stdIn.nextInt();

      int diff = a >= b ? a -b : b - a;

      if(diff <= 10)
        System.out.println("それらの差は10以下です");
      else
        System.out.println("それらの差は１１以上です。");
  }
}
