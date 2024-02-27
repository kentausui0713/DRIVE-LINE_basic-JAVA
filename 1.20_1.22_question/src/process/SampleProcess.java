package process;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleProcess {
	
	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

	//フィールド
	private final String hello = "こんにちは！";
	private final String country = "日本";
	private final String sushi = "寿司";
	private final String jp_food = "和食";

	//メソッド
	public void print() {
		//現在の日時を取得
		Date date = new Date();
		//任意のフォーマットを設定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:dd"); 
		
		//出力
//		if(this.hello != null && this.country != null)
		System.out.println(this.hello + "ここは" + this.country + "です！");
		System.out.println("この" + this.sushi + "はうまい");
		System.out.println(this.sushi + "は" + this.jp_food + "です");
		System.out.println("今の現在日時は" + sdf.format(date) + "です");
	}

}


