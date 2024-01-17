package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 21; j++) {
				if(j == 20) {
					System.out.println(String.format("%03d", i) + " * " + String.format("%03d", j) + " = " + String.format("%03d", i*j) + "\n");
				} else {
					System.out.print(String.format("%03d", i) + " * " + String.format("%03d", j) + " = " + String.format("%03d", i*j) + " || ");
				}
			}
		}

	}

}
