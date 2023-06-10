package chart06;

/**
 * 質問６-１︓以下静的なメソッドを定義してください。
1. メソッド名: megerArray
2. 引数１︓intの配列 left
3. 引数２︓intの配列 right
4. 戻り値︓intの配列
5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
以下メソッドの実施例︓
1 int[] left = new int[] {1, 2, 3, 4};
2 int[] right = new int[] {5, 6, 7, 8};
3 // メソッドを実施後
4 int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
 * @author liton
 *
 */
public class Chart06Q6_01 {

	public static void main(String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] megerArray = megerArray(left, right);

//				for (int result : megerArray) {
//					System.out.print(result + " ");
//				}
		Object[] array = new Object[megerArray.length];
		for (int i = 0; i < megerArray.length; i++) {
			array[i] = Integer.valueOf(megerArray[i]);
		}
		//System.out.print(array);
		printArray(array);
	}

	/**
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] megerArray(int[] left, int[] right) {
		int[] megerArray = new int[left.length + right.length];

		for (int i = 0; i < left.length; i++) {
			megerArray[i] = left[i];
		}
		for (int j = 0; j < right.length; j++) {
			megerArray[left.length + j] = right[j];
		}
		return megerArray;
	}
/**
 * 
 * @param objs
 */
	public static void printArray(Object[] objs) {
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
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
