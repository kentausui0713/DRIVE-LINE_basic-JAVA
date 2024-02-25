package process;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sample_process {
	
	private final String hello = "こんにちは！";
	private final String country = "日本";
	private final String sushi = "寿司";
	private final String jp_food = "和食";

	public void print() {
		//現在の日時を取得
		Date date = new Date();
		//任意のフォーマットを設定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:dd"); 
		
		//出力
		System.out.println(this.hello + "ここは" + this.country + "です！");
		System.out.println("この" + this.sushi + "はうまい");
		System.out.println(this.sushi + "は" + this.jp_food + "です");
		System.out.println("今の現在日時は" + sdf.format(date) + "です");
	}
	
	public void sample() {
		System.out.println("呼出し");
	}

}


