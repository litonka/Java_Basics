package chapter07_09Test;

public class Kicker {
	/*	public static void print(Parent v) {
			v.hello(); // Override実際発生する箇所
		}*/

	/*	public static void main(String... args) {
			Child c = new Child();
			c.hello();*/

	/*print(new Parent()); // parent method
	print(new Child()); // child method ⇒ 派生クラスは直接に渡す可能
	*/
	/*Human obj = null;
	System.out.println(obj.name);//nullpointer: obj =null;
	*/

	/*		Pet cat = new Pet();
			cat.setName = "xxx";//フィールド
			cat.setName("xxx");//メソッド
	*/

	/*	Pet cat = new Pet();
		cat.setAge(123);//定義されないメソッドをアクセスする
	*/

	/*	People1 obj = new People1("DCNET");*/
	/*		
			System.out.println(Human.PLANT);
			Human.staticMethod();
			new Human().sample();
			*/

	public static class InnerClassA {
		public String name;

		public InnerClassA(String name) {
			this.name = name;
		}

		public static class InnerClassB {
			public String name;

			public InnerClassB(String name) {
				this.name = name;
			}

			public String toString() {

				return "クラス名称" + name;
			}

			public static void main(String[] args) {
				System.out.println(new InnerClassA("innerClassA"));
				System.out.println(new InnerClassB("innerClassB"));
			}
		}

	}
}
