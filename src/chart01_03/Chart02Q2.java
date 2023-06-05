package chart01_03;

public class Chart02Q2 {
	public static void main(String[] args) {
		String foo = "Orange";
		String bar = "bar";
		
		if (foo.equals(bar)) {
			System.out.println("fooとbarは一緒です。");
		}else {
			System.out.println("fooとbarは違いです。");
		}
		
		bar = new String("Orange");
		System.out.println(bar);
		
		if (foo ==bar) {
			System.out.println("fooとbarは一緒です。");
		}else {
			System.out.println("fooとbarは違いです。");
		}
		
		if (foo.equals(bar)) {
			System.out.println("fooとbarは一緒です。");
		}else {
			System.out.println("fooとbarは違いです。");
		}
		
		bar = "Orange";
		System.out.println(bar);
		
		if (foo ==bar) {
			System.out.println("fooとbarは一緒です。");
		}else {
			System.out.println("fooとbarは違いです。");
		}
	}
}
