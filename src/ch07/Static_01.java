package ch07;

/**
 * 質問︓以下メソッドの静的メンバアクセス所を説明してください。（１箇所）
1 public static void main(String...args) {
2     System.out.println("some thing"); // ここに１箇所静的メンバアクセスしている
3}
1. 静的なフィールドは︖原因は︖ 答え：静的なフィールドはなし、
2. メソッドを呼び出していますか︖　答え：printlnメソッドを呼び出している。
3. メソッドを呼び出す時、渡すの引数は︖答え：渡すの引数は："some thing"
 * @author liton
 *
 */
public class Static_01 {
	public static void main(String[] args) {
		System.out.println("some thing");//ここに１１箇所静的メンバアクセスしている
	}

}
