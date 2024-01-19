package curriculum_B;
import java.util.Scanner;
import java.util.Random;

public class Qes6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		//パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
		//for文の無限ループ
		for(;;) {
			String input_product = s.next();
			String product[] = input_product.split("、");
			//拡張for文
			for(String p:product) {
				switch(p) {
				case "パソコン":
					System.out.println("パソコンの残り台数は" + r.nextInt(12) + "台です\n");
					break;
				case "冷蔵庫":
					System.out.println("冷蔵庫の残り台数は" + r.nextInt(12) + "台です\n");
					break;
				case "扇風機":
					System.out.println("扇風機の残り台数は" + r.nextInt(12) + "台です\n");
					break;
				case "洗濯機":
					System.out.println("洗濯機の残り台数は" + r.nextInt(12) + "台です\n");
					break;
				case "加湿器":
					System.out.println("加湿器の残り台数は" + r.nextInt(12) + "台です\n");
					break;
				case "テレビ":
				case "ディスプレイ":
					String result = p.equals("テレビ") ? "テレビの残り台数は"+ (r.nextInt(12)) +"台です\n" : "ディスプレイの残り台数は"+ (11 - r.nextInt(11)) +"台です\n";
					System.out.println(result);
					break;
				default:
					System.out.println("『" + p + "』は指定の商品ではありません\n");
				}
			}
		}
	}

}
