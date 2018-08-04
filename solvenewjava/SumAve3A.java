// 三つの変数xとyとzの合計と平均を表示(その1)
class SumAve3A {
	public static void main(String[] args) {
		int x,y,z;
		
		x = 63;	// xに63を代入
		y = 18;	// yに18を代入
		z = 52;	// zに52を代入
		
		System.out.println("xの値は" + x + "です。");	// xの値を表示
		System.out.println("yの値は" + y + "です。");	// yの値を表示
		System.out.println("zの値は" + z + "です。");	// zの値を表示
		System.out.println("合計の値は" + (x + y + z) + "です。");	// 合計の値を表示
		System.out.println("平均の値は" + (x + y + z) / 3 + "です。");	// 平均を表示
	}
}