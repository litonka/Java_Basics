package ch07;

/**
 * 2. 以下ソースのコンパイルエラーを説明してください。
 public class Kicker {
     private String word = "abc";
     public void print(String name) {
         System.out.println(name);
     }
     public static void main(String...args) {
         print("dcnet.java.教育");
         System.out.println(word);
     }
 }
 * @author liton
 *
 */
public class Static_02 {
	private String word = "abc";

	public void print(String name) {
		System.out.println(name);
	}

	public static void main(String... args) {
		new Static_02().print("dcnet.java.教育");//非静的メソッドアクセス、インスタンス化必要です。
		System.out.println(new Static_02().word);
		//wordフィールドは非性的フィールドです。静的mainメソッドから直接アクセスすることができません。インスタンス化必要です。

	}

}
