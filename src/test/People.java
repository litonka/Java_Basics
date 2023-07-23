package test;

public class People {
	public String name = "undefined";

	public People() {
		this(10);
	}

	private People(int a) {
		System.out.println("引数があるコンストラクタ");
		this.doInit();
	}

	public void doInit() {
		name = "初期化します...";
	}
	

}
