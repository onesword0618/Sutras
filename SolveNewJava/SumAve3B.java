// // �O�̕ϐ�x��y��z�̍��v�ƕ��ς�\��(����2)
class SumAve3B {
	public static void main(String[] args) {
		int x,y,z;
		int sum;
		
		x = 63;	// x��63����
		y = 18;	// y��18����
		z = 52;	// z��52����
		sum = x + y + z;
		
		System.out.println("x�̒l��" + x + "�ł��B");	// x�̒l��\��
		System.out.println("y�̒l��" + y + "�ł��B");	// y�̒l��\��
		System.out.println("z�̒l��" + z + "�ł��B");	// z�̒l��\��
		System.out.println("���v�̒l��" + sum + "�ł��B");	// ���v�̒l��\��
		System.out.println("���ς̒l��" + sum / 3 + "�ł��B");	// ���ς�\��
	}
}