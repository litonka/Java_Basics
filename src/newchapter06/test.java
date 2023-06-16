package newchapter06;

public class test {

	private static void fillArray(String[] array) {
		array = new String[] { "3", "4" };
	}

	public static void main(String[] args) {
		String[] array = new String[] { "1", "2" };
		fillArray(array);
		System.out.println(array[0]);
	}

}
