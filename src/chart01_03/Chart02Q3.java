package chart01_03;

/**
 * 質問３︓Float値⇒String⽂字列変更する場合、どうなメソッドを利⽤しますか
 * 1. String.valueOf(“1.0F“)
 * 2. 1.0F + ““
 * @author liton
 *
 */
public class Chart02Q3 {

	public static void main(String[] args) {
		Float f = 1.0F;
		String str = String.valueOf(f);
		System.out.println(str);

	}

}
