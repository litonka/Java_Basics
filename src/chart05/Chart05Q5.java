package chart05;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * 質問５︓質問３の配列に値「７」のインデックスを求む。
 * @author liton
 *
 */
public class Chart05Q5 {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				System.out.println("配列に値「７」のインデックス:" + i);
			}
		}
	}

}
