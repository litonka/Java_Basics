package newchapter06;

/**
 * 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 * @author liton
 *
 */
public class Q9 {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 6 };
		int[] b = new int[] { 3, 2, 5 };
		int[] mergerArray = megerArray(a, b);
		printArray(mergerArray);
	}

	/**
	 * 引数left と 引数right をマージして、新しい配列を作成して返却する * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static int[] megerArray(int[] left, int[] right) {
		int[] megerArray = new int[left.length + right.length];
		int index = 0;
		for (int i : left) {
			megerArray[index] = i;
			index++;
		}
		for (int i : right) {
			megerArray[index] = i;
			index++;
		}
		return megerArray;
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
