package chart06;

/**
 * 質問４︓以下メソッドの実施結果を教えてください。
1 public class Kicker {
2     private static void fillArray(String[] array) {
3         array[0] = "value2";
4     }
5     public static void main(String args[]) {
6         String[] array = new String[]{"value1"};
7         fillArray(array);
8         System.out.println(array[0]);
9     }
10}
 * @author liton
 *
 */
public class Chart06Q4 {
	private static void fillArray(String[] array) {
		array[0] = "value2";
	}

	public static void main(String[] args) {

		String[] array = new String[] { "value1" };
		fillArray(array);
		System.out.println(array[0]);//value2

	}
}
