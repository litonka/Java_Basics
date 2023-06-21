package ch07;

/**
 * 質問１
 * @author liton
 *
 */
public class PetTest {

	public static void main(String[] args) {
		Pet cat = new Pet("cat", 2);
		Pet dog = new Pet("dog", 5);

		System.out.println(cat.getAge());
	}

}
