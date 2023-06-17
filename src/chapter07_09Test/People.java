package chapter07_09Test;

public class People {
	private String name;
	public String getName() {
		//　ここに this 省略可能
		//return this.name;
		return name;
	}
	
	public void setName(String name) {
		name = name;//引数のname　＝ 引数のname。 意味ないステートメント
		this.name = name;//	this の意味現在のクラスのオブジェクト
	}

}
