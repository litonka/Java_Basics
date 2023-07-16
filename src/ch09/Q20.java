package ch09;

/**
 * 質問２０︓以下コードをIS-A関係で説明してください。
System.out.println("1234"); // 静的のField
String value = String.format("%05d", 0); // 静的のメソッド
System.out.println(new Animal("cat").getName());
Animal v0 = new Animal(); // v0 は Animal 型
Animal v1 = new Cat("a cat"); // v1 は Cat 型, v1 は Animal 型
Animal v2 = new Dog("a dog"); // v2 は Dog 型, v2 は Animal 型
Cat v3 = new Cat(""); // OK
Dog v4 = new Dog(""); // OK
Cat v5 = new Animal(""); // NG
 * @author liton
 *
 */
public class Q20 {

}
