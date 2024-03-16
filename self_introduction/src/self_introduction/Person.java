package self_introduction;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String s, int i, double d, double dd){
		this.name = s;
		this.age = i;
		this.height = d;
		this.weight = dd;
	}
	
	//インスタンスメソッド「bmi」
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}
	
	//インスタンスメソッド「print」
	public void print(double bmi) {
		System.out.println("名前は" + this.name);
		System.out.println("年は" + this.age);
		System.out.println("BMIは" + bmi);
	}
	
}
