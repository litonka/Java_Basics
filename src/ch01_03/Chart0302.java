package ch01_03;

public class Chart0302 {

	public static void main(String[] args) {

		/*		int a;
				int b;
				
				a = num / 500;
				b = num%500;
				System.out.println(b);
				if (b>0) {
					int c;
					int d;
					c=b/100;
					d=b%100;
					System.out.println("500円のコイン数は："+a+"枚");
					System.out.println("100円のコイン数は:"+c+"枚");
				}else{
					System.out.println("500円のコイン数は："+a+"枚");
				}
				
				if (d>0) {
					int e;
					int f;
					c=b/50;
					d=b%50;
					System.out.println("50円のコイン数は："+a+"枚");
					System.out.println("100円のコイン数は:"+c+"枚");
				}else{
					System.out.println("500円のコイン数は："+a+"枚");
				}
			}*/

		int coin = 3348;
		int a, by, c, dy, e, fy, g, hy;
		a = coin / 500;
		by = coin % 500;
		c = by / 100;
		dy = by % 100;
		e = dy / 10;
		fy = dy % 10;
		g = fy / 5;
		hy = fy % 5;
		System.out.println("500円のコイン数は：" + a + "枚");
		System.out.println("100円のコイン数は：" + c + "枚");
		System.out.println("10円のコイン数は：" + e + "枚");
		System.out.println("5円のコイン数は：" + g + "枚");
		System.out.println("1円のコイン数は：" + hy + "枚");

		int amount = 3348;
		int coin500 = amount / 500;
		amount = amount % 500;
		int coin100 = amount / 100;
		amount = amount % 100;
		int coin10 = amount / 10;
		amount = amount % 10;
		int coin5 = amount / 5;
		amount = amount % 5;
		int coin1 = amount;
		System.out.println("500円のコイン数は：" + a + "枚");
		System.out.println("100円のコイン数は：" + c + "枚");
		System.out.println("10円のコイン数は：" + e + "枚");
		System.out.println("5円のコイン数は：" + g + "枚");
		System.out.println("1円のコイン数は：" + hy + "枚");

		int num = 3348;
		int[] coin4 = { 500, 100, 10, 5, 1 };
			for (int i = 0; i < coin4.length; i++) {
				int x = num / coin4[i];
				num = num % coin4[i];
				System.out.println(coin4[i]+"円玉は"+x+"枚");
			}
		


	}

}
