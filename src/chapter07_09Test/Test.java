package chapter07_09Test;

public class Test {

	public static void main(String[] args) {
		Object str = new String("DCNET");
		String value1 = (String) str;
		String value2 = String.class.cast(value1);
		String excep = (int) str;
	}

}
