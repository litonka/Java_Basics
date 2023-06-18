package ch07;

/**
 * 3.質問２に以下ソース修正したらコンパイルエラー解消できますが、理由を教えてください。
 public class Kicker {
     private String word = "abc";
     public void print(String name) {
         System.out.println(name);
     }
     public static void main(String...args) {
 	 Kicker kicker = new Kicker();
 	 kicker.print("dcnet.java.教育");
 	 System.out.println(kicker.word);
 	 }
 }

 * @author liton
 *
 */
public class Static_03 {
	private String word = "abc";

	public void print(String name) {
		System.out.println(name);
	}

	public static void main(String... args) {
		//クラスのインスタンスを作成して、非静的メソッドと非性的フィールドをアクセスすることができます。
		Static_03 kicker = new Static_03();
		kicker.print("dcnet.java.教育");
		System.out.println(kicker.word);
	}

}
