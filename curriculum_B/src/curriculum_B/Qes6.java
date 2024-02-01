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
			//入力された文字を変数input_productに代入
			String input_product = s.next();
			//input_productの文字を「、」区切りで配列productに代入
			String product[] = input_product.split("、");
			//拡張for文
			for(String p:product) {
				switch(p) {
				//それぞれ指定の文字だった場合、r.nextInt(12)で0~11のランダムな数字を残り台数として出力
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
				//三項演算子でテレビの場合は、0~11のランダムな数字を残り台数として出力
				//ディスプレイの場合は(11 - 0~11のランダムな数字)を残り台数として出力
				case "テレビ":
				case "ディスプレイ":
					String result = p.equals("テレビ") ? "テレビの残り台数は"+ (r.nextInt(12)) +"台です\n" : "ディスプレイの残り台数は"+ (11 - r.nextInt(11)) +"台です\n";
					System.out.println(result);
					break;
				//指定の商品名以外が入力された場合はエラー文を出力
				default:
					System.out.println("『" + p + "』は指定の商品ではありません\n");
				}
			}
		}
	}

}
