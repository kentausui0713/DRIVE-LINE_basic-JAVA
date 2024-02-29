package process;

public class Process extends Status{
	/*
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください

		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24

		さあ冒険に出かけよう！
	 
	 */
	
	//フィールド
	String name;
	int hp;
	int mp;
	int attack;
	int speed;
	int defence;
	
	//コンストラクタ(引数なし)　※引数なしで呼び出してしまった時は空欄か0にして間違いに気付けるようにする
	public Process() {
		this.name = "";
		this.hp = 0;
		this.mp = 0;
		this.attack = 0;
		this.speed = 0;
		this.defence = 0;
	}
	
	//コンストラクタ(引数指定あり)　※オーバーライド
	public Process(String name, int hp, int mp, int attack, int speed, int defence){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defence = defence;
	}
	
	//出力
	public void print() {
		System.out.println("こんにちは「" + this.name + "」さん");
		super.printStatus(this.hp,this.mp,this.attack,this.speed,this.defence);
		System.out.println("さあ、冒険に出かけよう！\n");
	}
	
}

//スーパークラス
class Status{
	//フィールド
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;
	
	//各変数のsetterメソッド
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	//各変数のgetterメソッド
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public int getAttack() {
		return this.attack;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getDefence() {
		return this.defence;
	}
	
	//ステータス部分の出力
	public void printStatus(int hp,int mp,int attack,int speed,int defence) {
		Status s = new Status();
		//setterメソッド
		s.setHp(hp);
		s.setMp(mp);
		s.setAttack(attack);
		s.setSpeed(speed);
		s.setDefence(defence);
		
		//ステータス部分の出力
		System.out.println("ステータス");
		System.out.println("HP：" + s.getHp());
		System.out.println("MP：" + s.getMp());
		System.out.println("攻撃力：" + s.getAttack());
		System.out.println("素早さ：" + s.getSpeed());
		System.out.println("防御力：" + s.getDefence() + "\n");
	}
	
}
