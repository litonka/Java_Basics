package ch05;

/**
 * 設問２︓5の階乗を求める(for)。
 * @author liton
 *
 */
public class Chart05Q2 {
	public static void main(String[] args) {
		int prod = 1;
		for (int i = 5; i > 0; i--) {
			prod = prod * i;
		}
		System.out.println("5の階乗:" + prod);

	}

}
