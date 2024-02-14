package basicClass;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	public static void main(String args[]) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		System.out.println(dog.animal);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog_num = new Dog(8);
		System.out.println(dog_num.num);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'-'MM'-'dd k':'mm':'ss");
		System.out.println(sdf.format(date));
	}
}
