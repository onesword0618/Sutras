// ���Ɩ���ǂݍ���ň��A
import java.util.Scanner;

class Greeting {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("���F"); String lastName = stdIn.next();
		System.out.print("���F"); String firstName = stdIn.next();
		
		System.out.print("����ɂ���" + lastName + firstName + "����");
	}
}
