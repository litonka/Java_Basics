package test;

public class Penguin {
	private String name;
	private int id;

	public Penguin(String myName, int myid) {
		name = myName;
		id = myid;
	}
	public void eat() {
		System.out.println(name+"正在吃");
	}
	public void sleep() {
		System.out.println(name+"正在睡");
	}

}
