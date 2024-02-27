package lion;

public class Lion {
	/*
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	 */
	
	//フィールド変数を宣言
	private String name;
	private double height;
	private int speed;
	
	//nameのsetter、getterメソッドを用意
	public void setName(String s) {
		if(s != null) {
			this.name = s;
		}
	}
	public String getName() {
		return this.name;
	}
	
	//heightのsetter、getterメソッドの用意
	public void setHeight(double d) {
		this.height = d;
	}
	public double getHeight() {
		return this.height;
	}
	
	//speedのsetter、getterメソッドを用意
	public void setSpeed(int i) {
		this.speed = i;
	}
	public int getSpeed() {
		return this.speed;
	}

	public static void main(String[] args) {
		//クラスのオブジェクトを生成
		Lion l = new Lion();
		
		//setterメソッドで値変更、getterメソッドで値の取得
		l.setName("ライオン");
		System.out.println("動物名：" + l.getName());
		l.setHeight(2.1);
		System.out.println("体長：" + l.getHeight() + "m");
		l.setSpeed(80);
		System.out.println("速度：" + l.getSpeed() + "km/h");
	}

}
