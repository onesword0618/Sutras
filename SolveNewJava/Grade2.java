// 点数をもとに成績を判定
import java.util.Scanner;

class Grade2 {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("点数：");
    int point = stdIn.nextInt();

    if (point < 0 || point > 100)
      System.out.println("不正な点数です。");
    else if (point <= 59)
      System.out.println("不可");
    else if (point <= 69)
      System.out.println("良");
    else
      System.out.println("優");
  }
}
