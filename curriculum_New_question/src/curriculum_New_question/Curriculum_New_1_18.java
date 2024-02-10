package curriculum_New_question;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String a, int b) {
		System.out.println(a + " " + b + "\n");
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void calc(int a, int b) {
		System.out.println(a * b + "\n");
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void piece(int[] a) {
		for(int i : a) {
			System.out.println(i + "\n");
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void calc(double a, double b){
		System.out.println(a + b + "\n");
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	//フィールド変数numを初期化
	static int num = 0;
	
	public static int[] ram(int a){
		//入力された数字をフィールド変数numに代入
		num = a;
		//入力された数字の回数分、配列を用意
		int[] random = new int[num];
		
		Random r = new Random();
		
		for(int i = 0; i < num; i++) {
			//配列randomに1~100のランダムな数字を格納
			random[i] = r.nextInt(101)+1;
			
			if(i == num-1) {
				//最後のみ1行空けたいため、改行の\nを入れる
				System.out.println(random[i] + "\n");
			} else {
				System.out.println(random[i]);
			}
		}
		//配列randomを戻り値に指定
		return random;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double ave(int[] random) {
		//randomの全ての値の合算用に変数sumを初期化
		int sum = 0;
		
		//for文でrandomの全ての値を自己代入
		for(int i = 0; i < random.length; i++) {
			sum += random[i];
		}
		
		//変数doubleの宣言と代入。どちらも整数型だと平均点の小数点が切り捨てられるので、右辺をdouble型へキャスト
		double average = (double)sum / (double)random.length;
		
		//平均点の出力
		System.out.println(average + "\n");
		
		//double型の変数averageを戻り値に指定
		return average;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void overFifty(double a) {
		System.out.println(a >= 50);
	}

	public static void main(String[] args) {
    //Q1のメソッド呼び出し
		String hello_ja = "Hello JavaSE";
		int eleven = 11;
		hello(hello_ja, eleven);
		
	//Q2のメソッド呼び出し
		calc(11,3);
		
	//Q3のメソッド呼び出し
		int[] array = {1,2,3};
		piece(array);
		
	//Q4の呼び出し
		calc(1.5,1.5);
		
	//Q5の呼び出しと配列randomへ戻り値を代入
		int[] random = ram(3);
		
	//Q6の呼び出しと変数averageへ戻り値を代入
		double average = ave(random);
	
	//Q7の呼び出し
		overFifty(average);
	}
}
