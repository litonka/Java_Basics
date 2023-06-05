package chart05;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * @author liton
 *
 */
public class Chart05Q3 {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array[0];
		int min = array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
			sum = sum + array[i];
		}
		double avg = (double) sum / array.length;
		System.out.println("最⼤値:" + max);
		System.out.println("最小値:" + min);
		System.out.println("和:" + sum);
		System.out.println("平均値:" + avg);
	}

}
