package chart05;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * @author liton
 *
 */
public class Chart05Q4 {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1, 9 };
		int a = array[0];
		for (int i = 0; i < array.length; i++) {
			//			System.out.println(array[x]);
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("重複した要素：" + array[i]);
				}
			}
		}

	}

}
