// �ǂݍ���2�����l���傫������\���i����1�Fif���j
import java.util.Scanner;

class Max2A {

	 public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

	 System.out.println("����a:");
	 	double a = stdIn.nextDouble();	
     System.out.println("����b�F");
    	double b = stdIn.nextDouble();
     
	 double max;
	 	if (a > b) 
	 		max = a;
	 	else
	 		max = b;
	 	
	 	System.out.println("�傫���ق��̒l��"+ max + "�ł��B");
	 }
}
