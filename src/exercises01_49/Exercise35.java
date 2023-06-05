package exercises01_49;

/**
 * 1から100までの整数のうち、奇数のみを表示するプログラムを作成してください。

 * @author liton
 *
 */
public class Exercise35 {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
