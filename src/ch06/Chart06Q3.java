package ch06;

/**
 * 質問３．以下メソッドの実施結果を教えてください。
1 public class Kicker {
2 private static void sayHello(String y) {
3 y = "Hello world";
4 }
5 public static void main(String args[]) {
6 String x = null;
7 sayHello(x);
8 System.out.println(x);
9 }
10}
 * @author liton
 *
 */
public class Chart06Q3 {
	private static void sayHello(String y) {
		y = "Hello word";
	}

	public static void main(String[] args) {
		String x = null;
		sayHello(x);
		System.out.println(x);//null
	}

}
