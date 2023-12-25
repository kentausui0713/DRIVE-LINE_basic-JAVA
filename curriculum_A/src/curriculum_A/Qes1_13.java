package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//変数の宣言
		byte num_byte;
		short num_short;
		int num_int;
		long num_long;
		float num_float;
		double num_double;
		char text_char;
		String text_str;
		boolean is_valid;
		
		//変数に初期値を代入
		num_byte = 0;
		num_short = 0;
		num_int = 0;
		num_long = 0L;
		num_float = 0.0F;
		num_double = 0.0;
		text_char = 'あ';
		text_str = "あ";
		is_valid = false;
		
		//変数に指定された値を代入
		num_byte = 10;
		num_short = 100;
		num_int = 1000;
		num_long = 10000L;
		num_float = 9.5F;
		num_double = 10.5;
		text_char = 'a';
		text_str = "ハロー";
		is_valid = true;
		
		//問題4　コンソール出力
		//コンソール出力 11110
		System.out.println(num_long + num_int + num_short + num_byte);
        //コンソール出力　20
		System.out.println(num_byte * 2);
		//コンソール出力 a ハロー true
		System.out.println(text_char + ' ' + text_str + ' ' + String.valueOf(is_valid));
		//コンソール出力 11130　全ての数字を足す
		System.out.println(num_byte + num_short + num_int + num_long + num_float + num_double);
		//コンソール出力　10000000000　小数点以外の全ての数字をかける
		System.out.println(num_byte * num_short * num_int * num_long);
		//コンソール出力　0.105　10.5割る100をする
		System.out.println(num_double / num_short);
		//コンソール出力　-90 10引く100をする
		System.out.println(num_byte - num_short);
		
		/*-------------------------------------------------------------------------
		問題5　ハローJAVA43という表示にするように直下のコードを修正
		String num="20";
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		-------------------------------------------------------------------------*/
		String num="20";
		int num1=23;
		System.out.println("ハローJAVA"+ (Integer.valueOf(num) + num1));
		
		//問題6　個人情報を変数にして、コンソール出力
		//変数の初期値を設定
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favorite_food = "寿司";
		
		//コンソール出力　初めまして山田太郎です
		System.out.println("初めまして" + name + "です");
		//コンソール出力　年齢は18歳です
		System.out.println("年齢は" + age + "歳です");
		//コンソール出力　身長は170.5cmです
		System.out.println("身長は" + height + "cmです");
		//コンソール出力　体重は62.2kgです
		System.out.println("体重は" + weight + "kgです");
		//コンソール出力　好きな食べ物は寿司です
		System.out.println("好きな食べ物は" + favorite_food + "です");
		
		//問題7　BMIの出力
		/*-------------------------------------------------------------------------
		コンソール出力　BMIは〇〇です
		BMI*10で小数点第一位を一の位に上げて、それをroundメソッドで四捨五入し、ダブル型にキャストして、10で割る　
		-------------------------------------------------------------------------*/
		System.out.println("BMIは" + (double)Math.round((weight / (height / 100 * height / 100))*10)/10 + "です");
		
		//問題8　6の変数に再代入してコンソール表示
		//『鈴木一郎 24歳 168.5cm 64.2kg オムライス』を変数に再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		favorite_food = "オムライス";
		
		//コンソール出力　初めまして鈴木一郎です
		System.out.println("初めまして" + name + "です");
		//コンソール出力　年齢は24歳です
		System.out.println("年齢は" + age + "歳です");
		//コンソール出力　身長は168.5cmです
		System.out.println("身長は" + height + "cmです");
		//コンソール出力　体重は64.2kgです
		System.out.println("体重は" + weight + "kgです");
		//コンソール出力　好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + favorite_food + "です");
		//コンソール出力　BMIは22.6です
		System.out.println("BMIは" + (double)Math.round((weight / (height / 100 * height / 100))*10)/10 + "です");
		
		//問題9 【年齢・身長・体重】の数値を和算で自己代入し、コンソール出力
		//変数を和算で自己代入する
		age += age;
		height += height;
		weight += weight;
		
		//コンソール出力　初めまして鈴木一郎です
		System.out.println("初めまして" + name + "です");
		//コンソール出力　年齢は48歳です
		System.out.println("年齢は" + age + "歳です");
		//コンソール出力　身長は337.0cmです
		System.out.println("身長は" + height + "cmです");
		//コンソール出力　体重は128.4kgです
		System.out.println("体重は" + weight + "kgです");
		//コンソール出力　好きな食べ物はオムライスです
		System.out.println("好きな食べ物は" + favorite_food + "です");
		//コンソール出力　BMIは11.31です
		System.out.println("BMIは" + (double)Math.round((weight / (height / 100 * height / 100))*100)/100 + "です");
		
		//問題10　問題8で使用した年齢が25歳以上ならtrueが出力されるようにする。if文は使わない。
		//ageの変数を24に再代入
		age = 24;
		//変数ageが25以上ならばtrue
		is_valid = (age >= 25);
		//コンソール表示　false
		System.out.println(is_valid);
		
		//問題11　8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		//変数を問題8の値にするため、再代入
		height = 168.5;
		weight = 64.2;
		//String型の変数を新たに生成し、String型に変換したものを代入
		String age_str = String.valueOf(age);
		String height_str = String.valueOf(height);
		String weight_str = String.valueOf(weight);
		
		//文字列型に型変換して、コンソール出力
		System.out.println(age_str + height_str + weight_str);
		
		//問題12　問題11で変換した【年齢・身長】を整数型に変換して出力してください
		//String型の変数age_strをint型に変換し、int型の変数age_intに代入する
		int age_int = Integer.parseInt(age_str);
		//String型の変数height_strをdouble型に変換し、int型にキャストして、int型の変数height_intに代入する
		int height_int = (int)Double.parseDouble(height_str);
		//コンソール出力　24
		System.out.println(age_int);
		//コンソール出力　168
		System.out.println(height_int);
		
		//問題13　12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		is_valid = (age_int == 25 || height_int >= 160);
		//コンソール出力　true
		System.out.println(is_valid);
	}
}
