package chapter07_09Test;

public class Child extends Parent {
	protected int b;

	public Child() {
		super();
	}

	@Override
	public void hello() {
		super.b = 100;
		this.b = 200;
		System.out.println("c m");
	}

}
