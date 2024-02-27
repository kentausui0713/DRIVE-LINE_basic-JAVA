package execution;


public class SampleExecution {
	public static void main(String args[]) {
		//変数spにprocessパッケージのsample_processクラスのオブジェクトを生成したものを代入
		process.SampleProcess sp = new process.SampleProcess();
		//変数spのオブジェクトがnullではなかったら、printメソッドを実行
		if(sp != null) {
			sp.print();
		}
	}
}
