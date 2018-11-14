// 問題2-4
// 三つのint変数に値を代入し、合計と平均を求めるプログラムを作成
class SumAve3C {
	public static void main(String[] args) {
		int x = 63;
		int y = 18;
		int z = 52;
		int sum = x + y + z;

		System.out.println("xの値は" + x + "です");	// xの値を表示
		System.out.println("yの値は" + y + "です");	// yの値を表示
		System.out.println("zの値は" + z + "です");	// zの値を表示
		System.out.println("合計は" + sum + "です");	// 合計を表示
		System.out.println("平均は" + sum / 3 + "です");	// 平均を表示
	}
}
