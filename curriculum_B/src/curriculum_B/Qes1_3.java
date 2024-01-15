package curriculum_B;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Random;

public class Qes1_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			String name = s.nextLine();
			if(name.length() >= 10) {
				System.out.println("名前を10文字以内にしてください\n");
			} else if(name.length() == 0 || name == null) {
				System.out.println("名前を入力してください\n");
			} else if(!(Pattern.matches("^[A-Za-z0-9]+$", name))){
				System.out.println("半角英数字のみで名前を入力してください\n");
			} else {
				int sum = 0;
				for(int i = 0; i < 1;) {
					//0~2の整数をランダムで生成
					int my_rsp = r.nextInt(3);
					int pc_rsp = r.nextInt(3);
					//名前、自分の手、相手の手を出力
					System.out.println("ユーザー名「" + name + "」を登録しました");
					System.out.println(name + "の手は" + rsp(my_rsp));
					System.out.println("相手の手は" + rsp(pc_rsp) + "\n");
					//switch文で自分の手と相手の手の組み合わせによって処理を変える。
					//自分が買った時のみ++i;を記述し、上記のfor文を終了させる。
					switch(my_rsp) {
					//自分の手がグーの時
					case 0:
						switch(pc_rsp) {
						case 0:
							System.out.println("DRAW あいこ もう一回しましょう！\n");
							break;
						case 1:
							System.out.println("やるやん。");
							System.out.println("次は俺にリベンジさせて\n");
							++i;
							break;
						case 2:
							System.out.println("俺の勝ち！");
							System.out.println("なんで負けたか、明日まで考えといてください。");
							System.out.println("そしたら何かが見えてくるはずです\n");
							break;
						}
						break;
					//自分の手がチョキの時
					case 1:
						switch(pc_rsp) {
						case 0:
							System.out.println("俺の勝ち！");
							System.out.println("負けは次につながるチャンスです！");
							System.out.println("ネバーギブアップ！\n");
							break;
						case 1:
							System.out.println("DRAW あいこ もう一回しましょう！\n");
							break;
						case 2:
							System.out.println("やるやん。");
							System.out.println("次は俺にリベンジさせて\n");
							++i;
							break;
						}
						break;
					//自分の手がパーの時
					case 2:
						switch(pc_rsp) {
						case 0:
							System.out.println("やるやん。");
							System.out.println("次は俺にリベンジさせて\n");
							++i;
							break;
						case 1:
							System.out.println("俺の勝ち！");
							System.out.println("たかがじゃんけん、そう思ってないですか？");
							System.out.println("それやったら次も、俺が勝ちますよ\n");
							break;
						case 2:
							System.out.println("DRAW あいこ もう一回しましょう！\n");
							break;
						}
						break;
					}
					//合計回数を数えるための変数sumにインクリメントで1プラスする
					++sum;
				}
				String sum_str = String.valueOf(sum);
				System.out.println("勝つまでにかかった合計回数は"+ sum_str +"回です");
				break; //while(true)に対してのbreak
			}
		}
		s.close();
	}
	//引数numが0："グー"、1："チョキ"、2："パー"の文字列を返すメソッド
	public static String rsp(int num) {
		if(num == 0) {
			return "グー";
		}else if(num == 1) {
			return "チョキ";
		}else if(num == 2) {
			return "パー";
		}else {
			return "エラー";
		}
	}

}
