// �L�[�{�[�h����ǂݍ��񂾒l+-5�͈̔͂̐����l�������_���ɐ������ĕ\��
import java.util.Random;
import java.util.Scanner;

class RandomPlusMinus5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt(); // x�ɐ����l��ǂݍ���
		
		System.out.println("���̒l��+-�̗����𐶐����܂����B");
		System.out.println("�l��" + (x -5 + rand.nextInt(11)) + "�ł��B");
	}

}