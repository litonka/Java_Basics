package newchapter06;

/**
 *  質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
 * @author liton
 *
 */
public class Q8 {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 2, 7, 8, 5 };
		int[] bubblesort = bubbleSort(array);
		printArray(bubblesort);
	}

	/**
	 * ⼊⼒した引数の配列をソートするメソッド
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * 配列をprintするメソッド
	 * @param objs
	 */
	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());

	}
}
