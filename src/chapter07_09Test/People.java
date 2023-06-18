package chapter07_09Test;

public class People {
	/*
	private String name;
	public String getName() {
		//　ここに this 省略可能
		//return this.name;
		return name;
	}
	
	public void setName(String name) {
		name = name;//引数のname　＝ 引数のname。 意味ないステートメント
		this.name = name;//	this の意味現在のクラスのオブジェクト
	}*/

	public String name = "undefined";

	//**コンストラクタ*/

	public People() {
		this(10);//コンストラクタからコンストラクタを呼び出す
	}

	public People(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//**コンストラクタ*//*
	private People(int a) {
		System.out.println("引数があるコンストラクタ");
		this.doInit();//別メソッドを呼び出す
	}

	//	普通のメソッド
	public void doInit() {
		name = "初期化します…";
	}

}
