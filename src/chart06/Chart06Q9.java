package chart06;

/**
 * 
 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 * @author liton
 *
 */

public class Chart06Q9 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 3, 5 };
		int[] arr2 = new int[] { 7, 6, 5 };

		int[] mergerArray = mergerArray(arr1, arr2);

		int[] array = bubbleSort(mergerArray);
		for (int result : array) {
			System.out.print(result + " ");
		}

	}

	/**
	 * 配列arr1と配列arr2をマージして新しい配列mergerArrayを返却する
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] mergerArray(int[] left, int[] right) {

		int[] mergerArray = new int[left.length + right.length];

		for (int i = 0; i < left.length; i++) {
			mergerArray[i] = left[i];
		}

		for (int j = 0; j < right.length; j++) {
			mergerArray[left.length + j] = right[j];
		}
		return mergerArray;

	}

	/**
	 * マージした配列mergerArrayをソートする
	 * 
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

}
