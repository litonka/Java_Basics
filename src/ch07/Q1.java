package ch07;

/**
 * 質問１︓以下コードのコンパイルエラー理由を教えてください。
// Pet.java
public class Pet {
	public String name;

	public void setName(String value) {
		this.name = value;
	}
}
// Kicker.java
public class Kicker {
	public static void main(String...args) {
		Pet cat = new Pet();
		cat.setAge(1234);
	}
} 
 * @author liton
 *
 */
public class Q1 {
	//PetクラスにはsetAgeメソッドが定義されていません。

}
