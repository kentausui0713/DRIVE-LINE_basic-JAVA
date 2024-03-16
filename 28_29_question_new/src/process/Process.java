package process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Process {
/*
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
 */
	
	
	public ArrayList<Integer> sort(String input) {
		String[] array = input.split(",");
		//Listを作成
		ArrayList<String> st_array = new ArrayList<String>();
		ArrayList<Integer> int_array = new ArrayList<Integer>();
		//Listにarrayの要素を追加(arrayを使用してList作成)
		if(array.length > 1) {
			for(String s:array) {
				st_array.add(s);
			}
		}
		
		if(st_array.isEmpty()) {
			System.out.println("「,」を1回以上入力してください");
			st_array.clear();
		} else {
			if(st_array.contains("昇順")) {
				st_array.remove(st_array.indexOf("昇順"));
				for(String s: st_array) {
					int value = Integer.parseInt(s);
					int_array.add(value);
				}
				Collections.sort(int_array);
			} else if(st_array.contains("降順")) {
				st_array.remove(st_array.indexOf("降順"));
				for(String s: st_array) {
					int value = Integer.parseInt(s);
					int_array.add(value);
				}
				Collections.sort(int_array, Collections.reverseOrder());
			} else {
				//昇順、降順が入力されていなかった場合
				System.out.println("「昇順」もしくは「降順」を入力してください");
				st_array.clear();
			}	
		}
		return (int_array);
	}
	
	//プリントメソッド
	public void print(ArrayList<Integer> array) {
		//配列city_dateに都道府県のデータを格納
		String[] city_date = {"北海道:札幌市:83424","青森県:青森市:9646", "岩手県:盛岡市:15275", 
				"宮城県:仙台市:7282","秋田県:秋田市:11638", "山形県:山形市:9323","福島県:福島市:13784",
				"茨城県:水戸市:6097","栃木県:宇都宮市:6408", "群馬県:前橋市:6362", "埼玉県:さいたま市:3798"};
		
		for(int i :array) {
			if(i >= 0 && i <= 10) {
				//":"区切りで配列dataに代入
				String[] data = city_date[i].split(":");
				//data[2]をdouble型に変換
				double area = Integer.parseInt(data[2]);
				System.out.println("都道府県名：" + data[0]);
				System.out.println("県庁所在地：" + data[1]);
				System.out.println("面積：" + area + "km2\n");
			} else {
				System.out.println("入力値が間違っています");
			}
		}
	}

}
