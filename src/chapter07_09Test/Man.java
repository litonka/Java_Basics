package chapter07_09Test;

public class Man {
	//属性・フィールド・クラスメンバ
	private int age;

	private String job;

	private int income;

	private int height;

	//操作・関数・メソッド
	public void eat() {
		System.out.println();
	}

	public void work() {
		System.out.println();
	}

	//暗然的なコンストラクタ
	public Man() {

	}

	//初期化 コンストラクタ
	public Man(int age, String job, int income, int height) {
		this.age = age;
		this.job = job;
		this.income = income;
		this.height = height;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getIncome() {
		return income;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

}
