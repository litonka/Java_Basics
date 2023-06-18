package ch05;

/**
 * 質問８︓LV10のパスカルの三⾓形を出⼒してください。
 * @author liton
 *
 */
public class Chart05Q8 {
	public static void main(String[] args) {

		int numRows = 10;
		int[][] array = new int[numRows][];
		for (int i = 0; i < numRows; i++) {
			array[i] = new int[i + 1];
			array[i][0] = 1;
			array[i][i] = 1;
		}
		for (int i = 2; i < numRows; i++) {
			for (int j = 1; j < i; j++) {
				array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
			}
		}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
