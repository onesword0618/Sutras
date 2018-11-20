//問題3-21 月を1~12の整数として読み込んで、それに対応する季節を表示するプログラムを作成
import java.util.Scanner;

class Season {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    System.out.print("何月？:");
      int month = scn.nextInt();
  switch (month){
    case 3:
    case 4:
    case 5: System.out.println("春");
    break;
    case 6:
    case 7:
    case 8: System.out.println("夏");
    break;
    case 9:
    case 10:
    case 11: System.out.println("秋");
    break;
    case 12:
    case 1:
    case 2: System.out.println("冬");
    default: System.out.println("そんな月はないっす");
    break;
  }
 }
}
