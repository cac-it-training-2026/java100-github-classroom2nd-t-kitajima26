package lesson09.challenge03.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void divide(int cakes, int childs) {

		//ここに適切な処理を記述
		try {
			System.out.println("1人" + (cakes / childs) + "個になります。");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("\nケーキを食べる園児がいません。");
		} finally {
			System.out.println("\nケーキの分配が終わりました。");
		}
	}
}
