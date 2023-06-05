package chart05;

/**
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * @author liton
 *
 */
public class Chart05Q6 {
	public static void main(String[] args) {

		int[][] arr1 = new int[][] {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};

		int[][] arr2 = new int[][] {
				{ 7, 8, 9 },
				{ 10, 11, 12 }
		};

		int[][] arr3 = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < arr1[0].length; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				arr3[i][j] = sum;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
