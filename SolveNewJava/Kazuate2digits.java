// 問題4-3 2桁の整数値（10〜99）を当てさせる《数当てゲーム》を作成せよ。
// 数当てゲーム（10〜99を当てさせる）
import java.util.Random;
import java.util.Scanner;

class Kazuate2digits {

  public static void main(String[] args){

    Random rand = new Random();

    // 当てるべき数：10〜99の乱数を生成
    int no = 10 + rand.nextInt(90);

    System.out.println("数当てゲーム開始");
    System.out.println("10~99の数を当ててください。");

    Scanner stdIn = new Scanner(System.in);

    int x;

    // 正解するまで繰り返し処理を行う
    do {
      System.out.println("いくつかな：");
      x = stdIn.nextInt();

      if(x > no){
        System.out.println("もっと小さな数です。");
      } else if (x < no){
        System.out.println("もっと大きな数です。");
      }
    } while (x != no);

    System.out.println("正解");
  }
}
