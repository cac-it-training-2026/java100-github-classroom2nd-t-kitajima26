package lesson05.challenge10;

/*
menuListとpriceListをインスタンスとして持つ
showMenueでメニューと料金の一覧を表示
osusumeMakeでランダムなメニューの文字列を返し、作る


*/
class SuperRobot {
	String[] menueList;
	int[] priceList;

	void showMenue() {
		for (int i = 0; i < menueList.length; i++) {
			System.out.println("Menue:" + menueList[i] + "\t\\" + priceList[i]);
		}
	}

	String osusumeMake() {
		boolean roopFlag = false;
		String menue;
		do {
			roopFlag = false;
			int num = (int) (Math.random() * (menueList.length));
			if (menueList[num] != null) {
				menue = menueList[num];
			} else {
				roopFlag = true;
			}
		} while (roopFlag);
		return menue;

	}
}
