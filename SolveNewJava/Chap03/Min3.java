// �O�̐����l�̍ŏ��l�����߂�
import java.util.Scanner;

class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la:");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb:");
		int b = stdIn.nextInt();
		
		System.out.print("�����lc:");
		int c = stdIn.nextInt();
		
		int min = a;
		if (b <  min) min = b;
		if (c <  min) min = c;
		
		System.out.println("�ŏ��l��" + min + "�ł��B");
	}
}