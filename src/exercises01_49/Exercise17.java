package exercises01_49;

public class Exercise17 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = b;
		b = a;
		a = c;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}

}
