package ch06;

/**
 * 質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。

 * @author liton
 *
 */
public class Chart06Q8 {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 3, 7 };
		int[] arr = bubbleSort(array);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	/**
	 * 引数arrayの配列の要素をソートした後の新しい配列arrayを返却する
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;

	}
}
