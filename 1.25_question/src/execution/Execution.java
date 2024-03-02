package execution;
import java.util.Random;
import java.util.Scanner;

public class Execution {
	/*
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください

		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24

		さあ冒険に出かけよう！
	 
	 */
	public static void main(String args[]) {
		//Scannerオブジェクト生成
		Scanner s = new Scanner(System.in);
		String name_input = s.next();
		s.close();
		
		//processクラスのオブジェクト生成
		process.Process p = new process.Process(name_input,rand(),rand(),rand(),rand(),rand());
		//Processクラスのprintメソッドの呼出し
		p.print();
	}
	
	//1~999のランダムな整数を返すメソッド
	public static int rand() {
		//Randomオブジェクト生成
		Random r = new Random();
		//1~999のランダムな整数を生成
		int rand = r.nextInt(999) + 1;
		return rand;
	}
}
