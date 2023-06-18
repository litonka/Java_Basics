package ch06;

/**
 * 質問5︓以下メソッドの実施結果を教えてください。
1 public class Kicker {
2     private static void fillArray(String[] array) {
3         array = new String[]{"1","2"};
4     }
5     public static void main(String args[]) {
6         String[] array = null;
7         fillArray(array);
8         System.out.println(array==Null);
9     }
10}
 * @author liton
 *
 */
public class Chart06Q5 {
	private static void fillArray(String[] array) {
		array = new String[] { "1", "2" };
	}

	public static void main(String[] args) {

		String[] array = null;
		fillArray(array);
		System.out.println(array==null);//true

	}
}
