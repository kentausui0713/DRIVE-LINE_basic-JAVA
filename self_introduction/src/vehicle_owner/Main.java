package vehicle_owner;

public class Main {
	public static void main(String[] args){
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		//Carクラスのオブジェクト生成
		Car car = new Car();
		car.setOwner(person1.fullName());
		System.out.println(car.getOwner());
		
		//Bicycleクラスのオブジェクト生成
		Bicycle bicycle = new Bicycle();
		bicycle.setOwner(person2.fullName());
		System.out.println(bicycle.getOwner());
		
		//Person1がbuyメソッドでcarを購入
		person1.buy(car);
		
		//person2がbuyメソッドでbicycleを購入
		person2.buy(bicycle);
	}
}
