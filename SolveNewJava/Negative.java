// �ǂݍ��񂾐����l�͕��̒l���H
import java.util.Scanner;

class Negative {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l:");
		int n = stdIn.nextInt();
	
		if(n < 0)
		System.out.println("���̒l�͕��ł��B");
	}
}