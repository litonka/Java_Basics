package ch09;

/**
 * 質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
 * @author liton
 *
 */
public class Q2 {
	public static void mian(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("thread running...");
			}
		}.start();
	}

}
