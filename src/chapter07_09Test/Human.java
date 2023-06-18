package chapter07_09Test;

public class Human {
	/*		//属性：名称を定義する
			public String name;
		
			//コンストラクタ
			public Human() {
				//コンストラクタに初期化処理を行う
				//コンストラクタ詳細は後で説明します。
				name = "名前なし";
			}
		
			//属性名称に対する操作
			public String getName() {
				return name;//該当クラスの属性：名称を戻します。
			}*/

	/*	private String name;
		protected int age = 10;
	
		public String getName() {
			return name;
		}
	*/

	/*//UML図
	public String name;
	protected int age;
	private int money;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void sleep() {
		
	}*/

	/*	protected String name;*/

	/*	//Getter & Setter
		*/
	/** 名称：私有を設定して */
	/*
	private String name;
	
	*//**
		* 名称を取得する
		* @return 名称
		*/
	/*
	public String getName() {
	return name;
	}
	
	*//**
		* 名称を設定する
		* @param name 設定した名称値
		*//*
			public void setName(String name) {
			this.name = name;
			}
			
			public static void main(String[] args) {
			Pet dog = new Pet("pupyy", 3);
			Date date = new Date();
			System.out.println(date);
			Human obj = new Human();
					String name1 = obj.getName();
					System.out.println(name1);
			obj.setName("new Name");
			String name2 = obj.getName();
			System.out.println(name2);
			}*/

	public static final String PLANT = "地球";

	public static void staticMethod() {
		System.out.println("静的メソッド");
	}
	
	public void sample() {
		System.out.println("非静的メソッド");
	}
}
