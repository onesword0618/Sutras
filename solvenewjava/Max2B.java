// �ǂݍ��񂾓�̎����l�̑傫���ق��̒l��\���i����2�F�������Z�q�j
import java.util.Scanner;

class Max2B {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a:");
		double a = stdIn.nextDouble();
		System.out.print("����b:");
		double b = stdIn.nextDouble();
	
		double max = a > b ? a : b;
		System.out.println("�傫�����̒l��" + max + "�ł��B");
	}
}