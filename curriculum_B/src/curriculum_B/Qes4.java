package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		//初期値を1にして、iが10より下の場合はループするfor文
		for(int i = 1; i < 10; i++) {
			//初期値を1にして、jが10より下の場合はループするfor文
			for(int j = 1; j < 10; j++) {
				//jが9の時は改行を入れたいので、if文を使用
				if(j == 9) {
					//String.format("%02d")で2桁で足りない場合は0パディングで文字列を指定
					System.out.println(String.format("%02d", i) + " * " + String.format("%02d",j) + " = " + String.format("%02d",i*j) + "\n");
				} else {
					//String.format("%02d")で2桁で足りない場合は0パディングで文字列を指定
					System.out.print(String.format("%02d", i) + " * " + String.format("%02d",j) + " = " + String.format("%02d",i*j) + " || ");
				}
			}
		}

	}

}
