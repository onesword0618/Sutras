//問題3-20 0,1,2のいずれかの値の乱数を生成、0であればグーを、1であれば、チョキを、2であればパーを表示するプログラムを生成
import java.util.Random;

class FingerFlashing {
  public static void main(String[] args){
    Random rm = new Random();

    System.out.print("コンピュータが生成した手:");
      int hand = rm.nextInt(3);
  switch (hand){
    case 0: System.out.println("グー");
    break;
    case 1: System.out.println("チョキ");
    break;
    case 2: System.out.println("パー");
    break;
  }
 }
}
