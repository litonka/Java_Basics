package chart04;

/**
 * 問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
 * @author liton
 *
 */
public class Chart04Q5 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}

		}
		System.out.println("最大値は" + max + "です");
		System.out.println("最小値は" + min + "です");
	}

}
