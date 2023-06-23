package chapter07_09Test;

public class Cat extends BasePet {
	//抽象メソッドをオーバーライドしなければいけません。
	@Override
	public void hello() {
		System.out.println("ニャー");
	}
}
