// �ǂݍ��񂾓�̐����l�̍���10�ȉ����ǂ�����\��(����2�F�������Z�q)
import java.util.Scanner;

class Diff2Digits2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����A�F");
		int a = stdIn.nextInt();
		System.out.print("����B�F");
		int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b -a;
		
		System.out.println("�����̍���" + (diff <= 10 ? "10�ȉ�" : "11�ȏ�") + "�ł��B");
	}
}
