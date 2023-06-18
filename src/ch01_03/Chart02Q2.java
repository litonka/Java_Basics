package ch01_03;

/**
 * 質問２︓Stringを⽐較⽅法は︖
 * 1. ==
 * 2. equals
 * @author liton
 *
 */
public class Chart02Q2 {
	public static void main(String[] args) {
		String foo = "Orange";
		String bar = "bar";

		if (foo.equals(bar)) {
			System.out.println("fooとbarは一緒です。");
		} else {
			System.out.println("fooとbarは違いです。");
		}

		bar = new String("Orange");
		System.out.println(bar);

		if (foo == bar) {
			System.out.println("fooとbarは一緒です。");
		} else {
			System.out.println("fooとbarは違いです。");
		}

		if (foo.equals(bar)) {
			System.out.println("fooとbarは一緒です。");
		} else {
			System.out.println("fooとbarは違いです。");
		}

		bar = "Orange";
		System.out.println(bar);

		if (foo == bar) {
			System.out.println("fooとbarは一緒です。");
		} else {
			System.out.println("fooとbarは違いです。");
		}
	}
}
