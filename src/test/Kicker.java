package test;

public class Kicker {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.familyName);
		String value = child.hello();
		System.out.println(value);
		System.out.println(child.hello());
	}
}
