// あらかじめ用意されたリストから無作為に単語を選び出し、自動的に言葉を作り出す
public class PhraseOMatic	{
	// メイン処理
	public static void main (String[] args){

		// 1つ目の単語リスト
		String [] wordListOne = {
			"24/7"
			,"multi-Tier"
			,"30,000 foot"
			,"B-to-B"
			,"win-win"
			,"front-end"
			,"web-based"
			,"pervasive"
			,"smart"
			,"six-sigma"
			,"critical-path"
			,"dynamic"
		};

		// 2つ目の単語リスト
		String [] wordListTwo = {
			"empowered"
			,"sticky"
			,"value-added"
			,"oriented"
			,"centric"
			,"distributed"
			,"clustered"
			,"branded"
			,"outside-the-box"
			,"positioned"
			,"networked"
			,"focused"
			,"leveraged"
			,"aligmed"
			,"targeted"
			,"shared"
			,"cooperative"
			,"accelerated"
		};

		// 3つ目の単語リスト
		String [] wordListThree = {
			"process"
			,"tipping-point"
			,"solution"
			,"architecture"
			,"core competency"
			,"strategy"
			,"mindshare"
			,"space"
			,"vision"
			,"paradigm"
			,"mission"
		};

		// 単語リストにいくつかの単語が含まれているかを調べる
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// 3つの数を無作為に作る
		int rand1 = (int)(Math.random()*oneLength);
		int rand2 = (int)(Math.random()*twoLength);
		int rand3 = (int)(Math.random()*threeLength);

		// 単語を組み合わせて言葉を作る
		String phrase =wordListOne [rand1] + " " +
		wordListTwo [rand2] + " " + wordListThree [rand3];

		// 作った言葉を画面に表示する
		System.out.println("What we need is a " + phrase);
	}
}
