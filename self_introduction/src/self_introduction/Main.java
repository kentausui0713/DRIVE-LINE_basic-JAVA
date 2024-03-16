package self_introduction;

public class Main {
	  public static void main(String[] args) {
		    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		   
		    System.out.println(person1.name);
		    System.out.println(person1.age);
		    System.out.println(person1.height);
		    System.out.println("合計人数は⚪︎人です");
		    //printメソッドの確認用
		    person1.print(person1.bmi());
		  }
}
