// �ǂݍ��񂾐����l�����ł����10�̔{���ł��邩�ǂ�����\��
import java.util.Scanner;

class MultipleOf10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if (n > 0)
			if (n % 10 == 0)
				System.out.println("���̒l��10�̔{���ł��B");
			else
				System.out.println("���̒l��10�̔{���ł͂���܂���B");
		else
			System.out.println("���łȂ��l�����͂���܂����B");	
	}
}