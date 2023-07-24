package ch07;

/**
 * 質問２︓Mathクラスを作成してください。以下メソッドを定義します。
 1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
 2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
 3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
 4. mainメソッドで上記それぞれメソッドを呼び出してください。
以下はメソッドの定義のソースの抜枠です。
public class Math {
	public static int max(int[] input) {
		//...
	}
}
 * @author liton
 *
 */
public class Math {
	public static int max(int[] input) {
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	public static int min(int[] input) {
		int min = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;

	}

	public static double avg(int[] input) {
		double sum = 0;
		for (double number : input) {
			sum = sum + number;
		}

		return sum / input.length;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 8, 3, 4, 8 };
		System.out.println("配列のMAXは：" + Math.max(array));
		System.out.println("配列のMINは：" + Math.min(array));
		System.out.println("配列の平均値は：" + Math.avg(array));

	}

}
