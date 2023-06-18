package ch04;

/**
 * 問題７︓⾏列（２次元配列）の和と積を計算してください。
 * @author liton
 *
 */
public class Chart04Q7 {

	public static void main(String[] args) {

		int[][] array1 = new int[][] {
				{ 1, 2 },
				{ 21, 22 }
		};

		int[][] array2 = new int[][] {
				{ 1, 2 },
				{ 11, 12 }
		};
		//和を格納するため、新しい配列を作成する
		int[][] array3 = new int[array1.length][array1[0].length];

		//和を計算する
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		//和を格納するため、新しい配列を作成する
		int[][] array4 = new int[array1.length][array1[0].length];
		//		積を格納するため、
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array4[i][j] = array1[i][j] * array2[i][j];
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}

	}
}
