package chart06;

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
public class Chart06Q10 {
	public static void main(String[] args) {

		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };

		trim(input);

	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static char[] trim(char[] input) {
		char[] output = null;
		int index1 = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') {
				index1 = i;
				output[0] = input[i];
				System.out.println(output[0]);
				break;
			}

		}

		int index2 = 0;
		for (int i = input.length - 1; i < input.length; i--) {
			if (input[i] != ' ') {
				index2 = i;
				System.out.println(index2);
				break;
			}
		}

		return output;

	}
}
