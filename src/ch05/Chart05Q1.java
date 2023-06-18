package ch05;

/**
 * 設問１︓1から100までの偶数の和を求める(for + if)。
 * @author liton
 *
 */
public class Chart05Q1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1から100までの偶数の和:" + sum);
	}

}
