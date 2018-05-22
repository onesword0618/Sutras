// 球の表面積と体積を求める（円周率3.14はfinal変数）

import java.util.Scanner;

class Globe {

	public static void main(String[] args){
	
		Scanner stdln = new Scanner(System.in);
		final double Pl = 3.1416;
		
		System.out.println("球の表面積と体積を求めます。");
		System.out.println("半径：");	// 半径の入力を促す
		double r = stdln.nextDouble();	// rに実数値を読み込む

		System.out.println("表面積は" + (4 * Pl * r * r) + "です。");
		System.out.println("表面積は" + (4 / 3.0 * Pl * r * r * r) + "です。");
	}
}