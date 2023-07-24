package test;

public class SubClass extends SuperClass {
	private int n;

	SubClass() {//自動调用父类的无参数构造器
		System.out.println("SubClass");
	}

	public SubClass(int n) {
		super(300);//調用父類中帶有參數的構造器
		System.out.println("SubClass(int n):" + n);
		this.n = n;
	}
}
