package newchapter06;

/**
 * 質問５︓以下メソッドの実施結果を教えてください。
1 public class Kicker {
2 		private static void fillArray(String[] array) {
3 			array = new String[]{"1", "2"};
4 		}
5 		public static void main(String args[]) {
6 			String[] array = null;
7 			fillArray(array);
8 			System.out.println(array == null);
9 		}
10}
 * @author liton
 *
 */
public class Q5 {

	public static void fillArray(String[] array) {
		array = new String[] { "1", "2" };
	}

	public static void main(String args[]) {
		String[] array = null;
		fillArray(array);
		System.out.println(array == null);//実施結果:true
	}

}
