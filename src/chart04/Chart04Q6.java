package chart04;

/**
 * 問題６︓問題１の配列のSUMを求める。
 * 問題１︓int[] array = new int[4]; 各要素の値を記載してください。
 * @author liton
 *
 */
public class Chart04Q6 {

	public static void main(String[] args) {

		int[] array = new int[4];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}

}
