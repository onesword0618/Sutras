// �L�[�{�[�h����ǂݍ��񂾐����l�̍ŉ��ʌ����������l�ƍŉ��ʌ���\��
import java.util.Scanner;

class LowestDigit {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt(); // x�ɐ����l��ǂݍ���
		
		System.out.println("�ŉ��ʌ����������l��" + (x/10) + "�ł��B");
		System.out.println("�ŉ��ʌ���" + (x % 10) + "�ł��B");
	}
}