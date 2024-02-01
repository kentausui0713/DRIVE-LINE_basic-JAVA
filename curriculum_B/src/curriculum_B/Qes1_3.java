package curriculum_B;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Random;

public class Qes1_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		//無限ループ
		while(true) {
			//変数nameに入力された値を格納
			String name = s.nextLine();
			//入力文字制限（10文字以上、空欄、半角英数字以外の時にエラー文出力、while文の初めに戻る）
			if(name.length() >= 10) {
				System.out.println("名前を10文字以内にしてください\n");
			} else if(name.length() == 0 || name == null) {
				System.out.println("名前を入力してください\n");
			} else if(!(Pattern.matches("^[A-Za-z0-9]+$", name))){
				System.out.println("半角英数字のみで名前を入力してください\n");
			} else {
				//ユーザー名が正常に入力された際の処理
				
				//勝つまでにかかった回数をカウントするための変数sumを初期化
				int sum = 0;
				//ユーザーが勝つまでループするfor文(iが1より下の場合はループで、買った場合に++iを入れることループが停止)
				for(int i = 0; i < 1;) {
					//my_rspが自分の手、pc_rspが相手の手で、0~2の整数をランダムで生成しそれぞれの変数に代入
					int my_rsp = r.nextInt(3);
					int pc_rsp = r.nextInt(3);
					//名前、自分の手、相手の手を出力
					System.out.println("ユーザー名「" + name + "」を登録しました");
					System.out.println(name + "の手は" + rsp(my_rsp));
					System.out.println("相手の手は" + rsp(pc_rsp) + "\n");
					//switch文で自分の手と相手の手の組み合わせによって処理を変える。
					switch(my_rsp) {
					//自分の手がグーの時
					case 0:
						switch(pc_rsp) {
						//相手の手がグーの時
						case 0:
							System.out.println("DRAW あいこ もう一回しましょう！\n");
							break;
						//相手の手がチョキの時
						case 1:
							System.out.println("やるやん。");
							System.out.println("次は俺にリベンジさせて\n");
							++i;
							break;
						//相手の手がパーの時
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
						//相手の手がグーの時
						case 0:
							System.out.println("俺の勝ち！");
							System.out.println("負けは次につながるチャンスです！");
							System.out.println("ネバーギブアップ！\n");
							break;
						//相手の手がチョキの時
						case 1:
							System.out.println("DRAW あいこ もう一回しましょう！\n");
							break;
						//相手の手がパーの時
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
						//相手の手がグーの時
						case 0:
							System.out.println("やるやん。");
							System.out.println("次は俺にリベンジさせて\n");
							++i;
							break;
						//相手の手がチョキの時
						case 1:
							System.out.println("俺の勝ち！");
							System.out.println("たかがじゃんけん、そう思ってないですか？");
							System.out.println("それやったら次も、俺が勝ちますよ\n");
							break;
						//相手の手がパーの時
						case 2:
							System.out.println("DRAW あいこ もう一回しましょう！\n");
							break;
						}
						break;
					}
					//合計回数を数えるための変数sumにインクリメントで1プラスする
					++sum;
				}
				//int型の変数sumをString型にキャストし、変数sum_strに代入
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
