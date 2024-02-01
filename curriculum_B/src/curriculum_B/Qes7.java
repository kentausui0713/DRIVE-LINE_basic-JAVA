package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		//変数num_of_peopleに入力された数字を代入
		int num_of_people = s.nextInt();
		System.out.print("\n");
		
		//人数が入力された時、1以下ならば入力処理を再出力
		if(num_of_people >= 2) {
			//1次元は生徒の判別に使用し、2次元に0:英語、1:数学、2:理科、3:社会の点数を入れていくための多次元配列
			double[][] score = new double[num_of_people][4];
			//各教科の点数の入力処理
			for(int i = 0; i < num_of_people; i++) {
				System.out.print((i+1) + "人目の『英語』の点数を入力してください :");
				score[i][0] = s.nextInt();
				
				System.out.print((i+1) + "人目の『数学』の点数を入力してください :");
				score[i][1] = s.nextInt();
				
				System.out.print((i+1) + "人目の『理科』の点数を入力してください :");
				score[i][2] = s.nextInt();
				
				System.out.print((i+1) + "人目の『社会』の点数を入力してください :");
				score[i][3] = s.nextInt();
				System.out.print("\n");
			}
			//各教科の変数の初期化
			double english = 0.0;
			double math = 0.0;
			double science = 0.0;
			double society = 0.0;
			//全体の平均点の合計を出す変数の初期化
			double all_ave = 0.0;
			
			for(int j = 0; j < num_of_people; j++) {
				//各生徒の平均を出力
				double ave = (score[j][0] + score[j][1] + score[j][2] + score[j][3])/4;
				if(j == (num_of_people-1)) {
					System.out.println(j+1 + "人目の平均点は" + String.format("%.2f", ave) + "点です。\n");
				} else{
					System.out.println(j+1 + "人目の平均点は" + String.format("%.2f", ave) + "点です。");
				}
				//全体の平均を出すために各生徒の平均を足していく変数all_aveを宣言
				all_ave += ave;
				
				//各教科の合算
				english += score[j][0];
				math += score[j][1];
				science += score[j][2];
				society += score[j][3];
				
				//最後に科目別の平均点、全体の平均点を出力
				if(j == (num_of_people-1)) {
					System.out.println("英語の平均点は" + String.format("%.2f" , (english/num_of_people)) +"点です。");
					System.out.println("数学の平均点は" + String.format("%.2f", (math/num_of_people))  + "点です。");
					System.out.println("理科の平均点は" + String.format("%.2f", (science/num_of_people)) + "点です。");
					System.out.println("社会の平均点は" + String.format("%.2f", (society/num_of_people)) + "点です。");
					System.out.println("全体の平均点は" + String.format("%.2f", (all_ave/num_of_people)) + "点です。");
				}
			}
		} else{
				System.out.print("生徒の人数を入力してください（2以上）:");
				num_of_people = s.nextInt();
				System.out.print("\n");
		}
		s.close();
	}
}
