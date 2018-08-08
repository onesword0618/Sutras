// 問題3−16　キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
// たとえば、２，３，１の中央値は2で、１，２，1の中央値は1で、3,3,3の中央値は3である。

// 3つの整数値の中央値を求める
import java.util.Scanner;

class Med3 {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値a");
    int a = stdIn.nextInt();
    System.out.print("整数値b");
    int b = stdIn.nextInt();
    System.out.print("整数値c");
    int c = stdIn.nextInt();

    int med;

    if (a >= b){
      if(b >= c){
        med = b;
    } else if (a <= c){
        med = a;
    } else {
      med = c;
    }
  } else if (a > c){
    med = a;
  } else if (b > c){
    med = c;
  } else{
    med = b;
    }
    System.out.println("中央値は"+ med + "です。");
  }
}
