package self_introduction_part1;

public class Main {
	  public static void main(String[] args) {
		    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		   
		    System.out.println(person1.name);
		    System.out.println(person1.age);
		    System.out.println(person1.height);
		    
		    //printメソッドの確認用
		    person1.print(person1.bmi());
		    System.out.println("合計" + person1.counter() + "人です");
	}
}
