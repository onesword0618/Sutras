// �ǂݍ���2�̐����l�̑召�֌W��\��
import java.util.Scanner;

class Balance {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ϐ�a:");
		int a = stdIn.nextInt();
		
		System.out.println("�ϐ�b:");
		int b = stdIn.nextInt();
		
		if(a > b)
		System.out.println("a�̂ق����傫���ł��B");
		else if (a < b)
		System.out.println("b�̂ق����傫���ł��B");
		else
		System.out.println("a��b�͓����l�ł��B");
	}
}