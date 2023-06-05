package chart01_03;

public class Chart0301 {

	public static void main(String[] args) {
		int a = 56;
		System.out.println("成績ランキング判断。入力値＝" + a);
		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 80 && a < 90) {
			System.out.println("B");
		} else if (a >= 70 && a < 80) {
			System.out.println("C");
		} else if (a >= 60 && a < 70) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}

}
