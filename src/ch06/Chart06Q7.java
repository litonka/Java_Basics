package ch06;

/**
 * 質問７︓以下静的なメソッドを定義してください。
1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
以下メソッドの実施例︓
1 char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
2 // メソッドを実施後
3 char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
ヒント︓
1. 配列の起点から、 ' ' ではない⽂字列のインデックスを探す。
2. 配列の終点から、 ' ' ではない⽂字列のインデックスを探す。
3. 起点と終点を引数として、質問６-２で作成したサブ配列メソッドを呼び出して、結果
を求める。
 * @author liton
 *
 */
public class Chart06Q7 {
	public static void main(String[] args) {

		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		char[] output = trim(input);
		printArray(output);

	}

	/**
	 * 配列の起点から、 ' ' ではない⽂字列のインデックス startIndex を探す
	 * 配列の終点から、 ' ' ではない⽂字列のインデックス endIndex を探す
	 * サブ配列メソッドを呼び出す
	 * @param array
	 * @return
	 */
	public static char[] trim(char[] array) {

		int startIndex = 0;
		int endIndex = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ') {
				startIndex = i;
				break;
			}
		}

		for (int i = array.length - 1; i < array.length; i--) {
			if (array[i] != ' ') {
				endIndex = i;
				break;
			}
		}

		return subArray(array, startIndex, endIndex - startIndex + 1);

	}

	/**
	 * startIndexからendIndexまでサブ配列を取得する
	 * 新しい配列subArrayを返却する
	 * @param array
	 * @param startIndex
	 * @param length
	 * @return
	 */
	public static char[] subArray(char[] array, int startIndex, int length) {

		char[] subArray = new char[length];

		for (int i = 0; i < length; i++) {
			subArray[i] = array[startIndex + i];
		}
		return subArray;

	}

	public static void printArray(char[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("['");
		for (char obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = "', '";
		}
		sb.append("']");
		System.out.println(sb.toString());
	}

}
