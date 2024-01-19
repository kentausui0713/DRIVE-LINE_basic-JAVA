package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j == 9) {
					System.out.println(String.format("%02d", i) + " * " + String.format("%02d",j) + " = " + String.format("%02d",i*j) + "\n");
				} else {
					System.out.print(String.format("%02d", i) + " * " + String.format("%02d",j) + " = " + String.format("%02d",i*j) + " || ");
				}
			}
		}

	}

}
