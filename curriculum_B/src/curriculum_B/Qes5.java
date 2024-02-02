package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		//1~9までの繰り返しfor文
		for(int i = 1; i < 10; i++) {
			//1~20までの繰り返しfor文
			for(int j = 1; j < 21; j++) {
				if(j == 20) {
					//jが20の時、printlnで改行と\nで改行(改行2つ分)。3桁指定で0パディング。
					System.out.println(String.format("%03d", j) + " * " + String.format("%03d", i)  + " = " + String.format("%03d", i*j) + "\n");
				} else {
					//jが20以外の時、printで改行せずに出力。3桁指定で0パディング。
					System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) +  " = " + String.format("%03d", i*j) + " || ");
				}
			}
		}

	}

}
