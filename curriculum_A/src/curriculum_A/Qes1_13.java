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
		num_float = 0F;
		num_double = 0;
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
		//コンソール出力　BMIは○○です
		System.out.println("BMIは" + (weight / (height / 100 * height / 100)) + "です");
	}

}
