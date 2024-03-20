package self_introduction_part1;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	
	//クラスフィールドを定義
	public static int count = 0;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String s, int i, double d, double dd){
		this.name = s;
		this.age = i;
		this.height = d;
		this.weight = dd;
		count++;
	}
	
	//インスタンスメソッド「bmi」
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		//小数点以下を切り捨て
		bmi = Math.floor(bmi);
		return bmi;
	}
	
	//インスタンスメソッド「print」
	public void print(double bmi) {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi + "です");
	}
	
	public int counter() {
		return count;
	}
	
}
