// �ǂݍ��񂾐����l�͖񐔂ł��邩�ǂ���(�_���␔���Z�q)

import java.util.Scanner;

class Measure2 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�A�F");
			int a = stdIn.nextInt();
		System.out.print("�ϐ�B�F");
			int b = stdIn.nextInt();
		
		if(!(a % b == 0))
			System.out.println("B��A�̖񐔂ł͂���܂���B");
		else
			System.out.println("B��A�̖񐔂ł��B");	
	}
}