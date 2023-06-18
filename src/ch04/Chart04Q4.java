package ch04;

/**
 * 問題４︓以下２重Foreachを理解してください。
 * @author liton
 *
 */
public class Chart04Q4 {

	public static void main(String[] args) {

		//		2次元配列を作成する
		int[][] array2d = new int[4][2];
		//		array2dの各要素をoutに代入する
		for (int[] out : array2d) {
			//			outの各要素をinnerに代入する
			for (int inner : out) {
				System.out.println(inner);//配列の要素を出力する
			}
		}

	}

}
