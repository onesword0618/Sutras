// �O�p�`�̖ʐς����߂ĕ\��

import java.util.Scanner;

class Triangle {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		
		System.out.print("��ӁF");
		double width = stdIn.nextDouble();
		
		System.out.print("�����F");
		double height = stdIn.nextDouble();
		
		// �ʐς����߂ĕ\��
		System.out.println("�ʐς�" + (width * height / 2) + "�ł��B");
	}
}