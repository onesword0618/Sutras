// �ǂݍ��񂾐����l�̐�Βl��\��
import java.util.Scanner;
class Absolute1 {

	public static void main(String[] args){
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����l:");
		int n = stdIn.nextInt();
		
		if (n >= 0)
			System.out.println("���̐�Βl��"+ n + "�ł��B");
		else
		System.out.println("���̐�Βl��"+ (-n) + "�ł��B");
	}
}