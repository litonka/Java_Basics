package chapter07_09Test;

public class Kicker {
	public static void main(String... args) {
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
		
		System.out.println(Human.PLANT);
		Human.staticMethod();
		new Human().sample();
		
	}

}
