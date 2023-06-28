package ch10;

public class Method01 {
	public static void main(String[] args) {
		System.out.println("a45bc".charAt(1));
		System.out.println("abc".compareTo("abc"));
		System.out.println("aBca".compareToIgnoreCase("abcd"));
		System.out.println("abc".concat("123"));
		System.out.println("abc".equals("123"));
		System.out.println("ABs".equalsIgnoreCase("Abs"));

		System.out.println("bba".indexOf("a"));
		System.out.println("ccd".lastIndexOf("c"));
		System.out.println("a245bc".length());

		System.out.println("abadx234".replace("a", "g"));
		String[] vs = "1,".split(",");
		System.out.println(vs.length);
		for (String a : vs) {
			System.out.println(a);
		}
		String[] vs2 = "1,".split(",", -1);
		System.out.println(vs2.length);
		for (String b : vs2) {
			System.out.println(b);
		}

	}

}
