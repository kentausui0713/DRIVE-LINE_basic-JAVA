package execution;

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
		//オブジェクト生成
		process.Process p = new process.Process("名前",849,862,375,937,24);
		//Processクラスのprintメソッドの呼出し
		p.print();
	}
}
