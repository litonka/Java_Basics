package ch08;

/**
 * 質問１︓以下コードの出⼒するを回答してください。
String x = "a";
String y = "a";
System.out.println(x == y); // true ? false? 原因は ?
System.out.println(x.equals(y)); // true ? false? 原因は ?
String nullString = null;
System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
 * @author liton
 *
 */
public class Q1 {
	public static void main(String[] args) {
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true 字列 "a" はコンパイル時に文字列プールに格納されているため、x と y は同じ文字列オブジェクトを参照しています。
		System.out.println(x.equals(y)); // true 文字列内容は一致します。
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); //  false 　　""とnullは一致しません
	}
}
