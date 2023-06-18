package ch06;

/**
 * 質問６-２︓以下静的なメソッドを定義してください。
1. メソッド名: subArray
2. 引数１︓intの配列 array
3. 引数２︓開始のstartIndex
4. 引数３︓⻑さlength
5. 戻り値︓intの配列
6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
以下メソッドの実施例︓
1 int[] array = new int[] {1, 2, 3, 4};
2 // start = 1, length = 2
3 int[] result = new int[] {2, 3}

 * @author liton
 *
 */
public class Chart06Q6_02 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4 };
		int startIndex = 1;
		int length = 2;

		int[] result = subArray(array, startIndex, length);

		printArray(result);

	}

	/**
	 * startIndexからstartIndex + lengthまでサブ配列を取得する
	 * 新しい配列arrを返却する
	 * @param array
	 * @param startIndex
	 * @param length
	 * @return
	 */
	public static int[] subArray(int[] array, int startIndex, int length) {

		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = array[startIndex + i];
		}
		return arr;

	}

	/**
	 * 配列resultを出力する
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
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ",";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
