package ch05;

/**
 * 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
 * @author liton
 *
 */
public class Chart05Q7 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
		}
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
