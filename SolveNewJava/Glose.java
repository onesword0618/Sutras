// ���̕\�ʐςƑ̐ς����߂�i�~����3.14��final�ϐ��j

import java.util.Scanner;

class Globe {

	public static void main(String[] args){
	
		Scanner stdln = new Scanner(System.in);
		final double Pl = 3.1416;
		
		System.out.println("���̕\�ʐςƑ̐ς����߂܂��B");
		System.out.println("���a�F");	// ���a�̓��͂𑣂�
		double r = stdln.nextDouble();	// r�Ɏ����l��ǂݍ���

		System.out.println("�\�ʐς�" + (4 * Pl * r * r) + "�ł��B");
		System.out.println("�\�ʐς�" + (4 / 3.0 * Pl * r * r * r) + "�ł��B");
	}
}