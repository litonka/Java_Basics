package ch08;

/**
 * 質問３︓以下コンパイルを修正してください。
 * @author liton
 *
 */
public class Child extends Parent {
	@Override //親クラスの強制的にoverrideする意味(アノテーション)
	public void hello() {
		System.out.println("child method");
	}

}
