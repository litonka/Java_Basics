package chapter07_09Test;

public class Sample {
	/*public static void main(String... args) {
		Human man = new Human();
	//		System.out.println(man.name); //NG, nameはprivateの為、アクセス不可
		System.out.println(man.age);//OK, ageはprotected、同じpackageクラスアクセス可能
		System.out.println(man.getName());//OK,　publicのため、いつでもどこでもアクセス可能
	}*/

	/*	public Sample(String m) {
			System.out.println("クラスを初期化する");
		}
	
		public Sample(int m) {
			//他のコンストラクタを呼び出す場合、必ず1行目
			this("他のコンストラクタを呼び出す");
			int a = 10;
		}*/

	public final int age = 10;
	public final String name;

	public Sample(String name) {
		this.name = name;
	}

}
