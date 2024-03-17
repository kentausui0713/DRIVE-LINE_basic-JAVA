package self_introduction_part3;

public class Person {
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	//インスタンスフィールドにlastNameを追加
	public String lastName;
	

	Person(String firstName, String lastName, int age, double height, double weight){
	this.firstName = firstName;
	this.lastName = lastName; //lastNameをコンストラクタに追加
	this.age = age;
	this.height = height;
	this.weight = weight;
	Person.count++;
	}

	public String fullName(){
	return this.firstName + this.lastName;
	}

	public void print(){
	System.out.println("名前は" + this.fullName() + "です");
	System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
	return this.weight / this.height / this.height;
	}

	public static void printCount(){
	System.out.println("合計" + Person.count + "人です");
	}
}
