// �ǂݍ��񂾐����l�̕���(��/��/0)�𔻒肵�ĕ\��

import java.util.Scanner;

class Sign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("���̒l�͐��ł��B");
		else if (n < 0)
			System.out.println("���̒l�͕��ł��B");
		else
			System.out.println("���̒l��0�ł��B");
	}
}