// 二つの変数xとyの合計と平均を表示
class SumAveError {
	
	public static void main(String[] args) {
		double x;	// xはint型の変数
		double y;	// yはint型の変数
		
		x = 63.4;	// xに63.4を代入
		y = 18.3;	// yに18.3を代入
		
		System.out.println("xの値は" + x + "です。");	// xの値を表示
		System.out.println("yの値は" + y + "です。");	// yの値を表示
		System.out.println("合計は" + (x + y) + "です。"); // 合計を表示
		System.out.println("平均は" + (x + y) / 2 + "です。"); // 平均を表示
	}
}