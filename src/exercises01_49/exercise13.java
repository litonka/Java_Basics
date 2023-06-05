package exercises01_49;

public class exercise13 {
	public static void main(String[] args) {
		int a = 10;
		if (a < 1) {
			System.out.println("aは１未満です");
		} else if (a >= 1 && a < 5) {
			System.out.println("aは1以上5未満です");
		} else if (a >= 5 && a < 10) {
			System.out.println("aは5以上10未満です");
		} else {
			System.out.println("aは10以上です");
		}
	}

}
