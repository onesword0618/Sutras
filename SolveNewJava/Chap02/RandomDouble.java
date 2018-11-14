// 問題2-１３
import java.util.Random;

class RandomDouble {

	public static void main(String[] args) {

		Random rand = new Random();

		double x1 = rand.nextDouble();
		double x2 = rand.nextDouble() * 10.0;
		double x3 = -1 + 2 * rand.nextDouble();

		System.out.println("3個の乱数を生成");
		System.out.println("0.0以上 0.1未満" + x1);
		System.out.println("0.0以上 10.0未満" + x2);
		System.out.println("-1.0以上 1.0未満" + x3);
	}
}
