package exercises01_49;

/**
 * 1から100までの整数を表示するプログラムを作成してください。ただし、3の倍数の場合は "Fizz"、5の倍数の場合は "Buzz"、3の倍数かつ5の倍数の場合は "FizzBuzz" と表示してください。
 * @author liton
 *
 */
public class Exercise36 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
