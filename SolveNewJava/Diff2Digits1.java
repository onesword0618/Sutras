import java.util.Scanner;

class Diff2Digits1 {

  public static void main(String[] args) {

      Scanner stdIn = new Scanner(System.in);

      System.out.print("����A�F");
      int a = stdIn.nextInt();
      System.out.print("����B�F");
      int b = stdIn.nextInt();

      int diff = a >= b ? a -b : b - a;

      if(diff <= 10)
        System.out.println("�����̍���10�ȉ��ł��B");
      else
        System.out.println("�����̍���11�ȏ�ł��B");
  }
}
