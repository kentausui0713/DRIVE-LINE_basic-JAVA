package animal;
import java.util.Scanner;

public class Animal {
	/*
	 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
	 */

	public static void main(String[] args) {
		//Scannerオブジェクト生成
		Scanner s = new Scanner(System.in);
		//変数inputに入力された文字列を代入
		String input = s.nextLine();

		//入力されるまで繰り返し
		while(input.isEmpty()) {
			System.out.println("入力してください");
			input = s.nextLine();
		}
		s.close();
		
		//「,」区切りの配列を作成
		String[] array = input.split(",");
		//変数countに配列の長さを代入
		int count = array.length;
		//animal[][0]に名前、animal[][1]に体長、animal[][2]に速度を入れるためにanimal[][]を宣言
		String[][] animal = new String[count][3];
		
		//変数arrayの配列の個数分、配列を回す
		for(int i = 0; i < count; i++) {
			if(array[i].split(":").length == 3) {
				// 「aaa:bbb:ccc」の形だったら、二次元配列animal[i][]にそれぞれ代入
				for(int j = 0; j < 3; j++) {
					animal[i][j] = array[i].split(":")[j];
				}
			} else {
				// 「aaa:bbb:ccc」の形ではなかった場合、二次元配列animal[i][]にそれぞれに空文字を代入
				for(int j = 0; j < 3; j ++) {
					animal[i][j] = "";
				}
			}
		}
		//このクラスのオブジェクト生成
		Animal a = new Animal();
		//出力
		for(int j = 0; j < count; j++) {
			//メソッドの呼出し
			a.print(animal[j]);
		}
	}
	
	//出力メソッド
	public void print(String[] array) {
		if(array[0].isEmpty() || array[1].isEmpty() || array[2].isEmpty()) {
			//どれかが空もしくはnullだった場合、エラー文を出力
			System.out.println("入力方法が間違っています");
		} else {
			Animal a = new Animal();
			System.out.println("動物名：" + array[0]);
			System.out.println("体長：" + array[1] + "m");
			System.out.println("速度：" + array[2] + "km/h");
			System.out.println("学名：" + a.findScientificName(array[0]) + "\n");
		}
	}
	
	//動物名によって学名を戻り値で返すメソッド
	public String findScientificName(String name) {
		String scientificName;
		switch(name) {
		case "ライオン":
			scientificName = "パンテラ　レオ";
			break;
		case "ゾウ":
			scientificName =  "ロキソドンタ・サイクロティス";
			break;
		case "パンダ":
			scientificName =  "アイルロポダ・メラノレウカ";
			break;
		case "チンパンジー":
			scientificName =  "パン・トゥログロディテス";
			break;
		case "シマウマ":
			scientificName =  "チャップマンシマウマ";
			break;
		default:
			scientificName =  "不明";
		}
		return scientificName;
	}
	
}
