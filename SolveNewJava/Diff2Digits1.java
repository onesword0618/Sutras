import java.util.Scanner;

class Diff2Digits1 {

  public static void main(String[] args) {

      Scanner stdIn = new Scanner(System.in);

      System.out.print("整数A：");
      int a = stdIn.nextInt();
      System.out.print("整数B：");
      int b = stdIn.nextInt();

      int diff = a >= b ? a -b : b - a;

      if(diff <= 10)
        System.out.println("それらの差は10以下です。");
      else
        System.out.println("それらの差は11以上です。");
  }
}
