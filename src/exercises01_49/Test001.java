package exercises01_49;

public class Test001 {
	public static void main(String[] args) {

	}

	static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return fact(n - 1) * n;

	}

}
