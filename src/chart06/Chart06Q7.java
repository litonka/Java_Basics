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
public class Chart06Q7 {
	public static void main(String[] args) {
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
	}

	public static char[] trim(char[] array) {
		return array;

	}
}
