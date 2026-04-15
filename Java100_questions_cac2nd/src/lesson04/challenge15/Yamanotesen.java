package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		// String[] sArray = { "品川", "大崎", "五反田", "目黒" };

		String[] sArray = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		boolean[] checkFlags = new boolean[sArray.length];
		Arrays.fill(checkFlags, true);

		System.out.println("「※※※ 山手線ゲーム ※※※」");
		System.out.println("「      ゲームスタート！    」");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean roopFlag = false;
		boolean isStation = false;
		boolean wasApp = false;
		boolean result = true;
		int count = 0;
		Random rand = new Random();

		do {
			isStation = false;
			String yinput = br.readLine();
			for (int i = 0; i < sArray.length; i++) {
				if (sArray[i].equals(yinput)) {
					isStation = true;
					if (checkFlags[i]) {
						checkFlags[i] = false;
						//* System.out.println(checkFlags[i]);
					} else {
						wasApp = true;
						break;
					}
				}
			}
			if (!isStation || wasApp) {
				result = false;
				break;
			}
			count++;

			//* システム側
			do {
				roopFlag = false;
				int num = rand.nextInt(sArray.length);

				if (checkFlags[num]) {
					count++;
					System.out.println(sArray[num]);
					checkFlags[num] = false;
				} else {
					roopFlag = true;
				}

			} while (roopFlag);

		} while (count < sArray.length);
		if (result) {
			System.out.println("「あなたの勝ちです！」");
		} else {
			System.out.println("「あなたの負けです！」");
		}

	}

}
