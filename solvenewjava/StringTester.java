// 文字列の初期化と代入
class StringTester {
	public static void main(String[] args) {
	
	String s1 = "ABC"; // 初期化
	String s2 = "XYZ"; // 初期化
	
		System.out.println("文字列s1は" + s1 + "です。");
		System.out.println("文字列s2は" + s2 + "です。");
		
		s1 = "FBI";		// 代入（値を書き換える）
		
		System.out.println("文字列s1は" + s1 + "です。");
		System.out.println("文字列s2は" + s2 + "です。");
	}
}