package newchapter06;

/**
 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
 
1 // 例：配列のMax値を求めるメソッド
2 public static int max(int[] datas) {
3	 // ...処理を記載
4 }
 * @author liton
 *
 */
public class Q2 {

	public static void main(String[] args) {
		int[] datas = new int[] { 1, 3, 5, 7 };
		//配列の和メソッドを呼び出す
		int sum = sum(datas);
		//配列のMAX値メソッドを呼び出す
		int max = max(datas);
		//配列のMIN値メソッドを呼び出す
		int min = min(datas);

		System.out.println("配列の和:" + sum);
		System.out.println("配列のMAX値:" + max);
		System.out.println("配列のMIN値:" + min);
	}

	/**
	 * 配列の和メソッド
	 * 和sumを返却する
	 * @param datas
	 * @return
	 */
	public static int sum(int[] datas) {
		int sum = 0;
		for (int i : datas) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * 配列のMAX値メソッド
	 * 配列のMAX値を返却する
	 * @param datas
	 * @return
	 */
	public static int max(int[] datas) {
		int max = datas[0];
		for (int i : datas) {
			if (max < i) {
				max = i;
			}
		}
		//		System.out.println(max);
		return max;
	}

	/**
	 * 配列のMIN値メソッド
	 * 配列のMIN値を返却する
	 * @param datas
	 * @return
	 */
	public static int min(int[] datas) {
		int min = datas[0];
		for (int i : datas) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

}
