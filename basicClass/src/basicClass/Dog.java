package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	public String animal;
	// Q2：フィールドに動物の数の変数を定義してください。
	public int num;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	Dog(){
		animal = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	Dog(int a){
		num = a;
	}
}
