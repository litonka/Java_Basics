package ch04;

public class Test01 {
	public static void main(String[] args) {
		/*	int a = 10;
			System.out.println(a);
			int[] b = new int[10];
			System.out.println(b[1]);*/

		/*int[] array = new int[3];
		System.out.println(array[2]);*/

		/*int[] array1 = new int[] { 1, 2, 3, 4 };
		System.out.println(array1.length);*/

		/*	int[] array2 = new int[] { 5, 6, 7, 8 };
			for (int i = 0; i < array2.length; i++) {
				System.out.println(array2[i]);
			}*/

		/*	int[] array =new int[] {5,6,7,8};
			for(int x: array) {
				System.out.println(x);
			}
			
			for(int i =0; i<array.length;i++) {
				int x = array[i];
				System.out.println(x);
			}*/

		int[][] array2d = new int[4][];
		array2d[0] = new int[] { 1, 2, 3, 4, 5 };
		array2d[1] = new int[] { 1, 2, 3, 4, 5 };
		array2d[2] = new int[] { 1, 2, 3, 4, 5 };
		array2d[3] = new int[] { 1, 2, 3, 4, 5 };

		int[][] array2dd = new int[4][2];
		array2dd[0][0] = 1;
		array2d[0][1] = 2;
		System.out.println(array2dd[3][1]);

		int[][] array2ddd = new int[][] {
				{ 1, 2, 3, 4 ,5,7},
				{ 21, 22, 23, 24 }
		};
		System.out.println(array2ddd[0].length);

	}
}
