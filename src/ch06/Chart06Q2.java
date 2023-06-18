package ch06;

/**
 * 質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
1 // 例：配列のMax値を求めるメソッド
2 public static int max(int[] datas) {
3  // ...処理を記載
4 }
 * @author liton
 *
 */
public class Chart06Q2 {

	public static void main(String[] args) {
		int[] datas = new int[] { 1, 2, 3 };
		int sumResult = sum(datas);
		int maxResult = max(datas);
		int minResult = min(datas);

		System.out.println("和：" + sumResult);
		System.out.println("MAX値：" + maxResult);
		System.out.println("MIN値：" + minResult);

	}

	public static int sum(int[] datas) {
		int sum = 0;
		for (int i : datas) {
			sum = sum + i;
		}
		return sum;
	}

	public static int max(int[] datas) {
		int max = datas[0];
		for (int i = 0; i < datas.length; i++) {
			if (max < datas[i]) {
				max = datas[i];
			}
		}
		return max;
	}

	public static int min(int[] datas) {
		int min = datas[0];
		for (int i = 0; i < datas.length; i++) {
			if (min > datas[i]) {
				min = datas[i];
			}
		}
		return min;
	}

}
