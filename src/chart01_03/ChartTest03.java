package chart01_03;

public class ChartTest03 {
	public static void main(String[] args) {

		//ifステートメント
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("ここに到着できない。");
		}
		System.out.println("該当行は実施しますか？");

		if (a > b) {
			System.out.println("ここに到着できない。");
		} else {
			System.out.println("b>a or a==b");
		}

		if (a > b) {
			System.out.println("a は b より大きい");
		} else if (a == b) {
			System.out.println("a は b 等しい");
		} else {
			System.out.println("b は a より大きい");
		}

		//switch ステートメント

		int c = 1;
		switch (c) {
		case 1:
			System.out.println("c=1");
			break;
		case 10:
			System.out.println("c=10");
			break;
		default://省略可能
			System.out.println("default");
			break;//省略可能
		}

		if (c == 1) {
			System.out.println("c=1");
		} else if (c == 10) {
			System.out.println("c=10");
		} else {
			System.out.println("default");
		}

		/*
		 //型 boolean の値でスイッチすることはできません
		  boolean value = true;
		switch (value) {
		case true:
			System.out.println("これは正しい");
			break;
		case false:
			System.out.println("これは間違い");
			break;
		default:
			System.out.println("default");
			break;
		
		}*/

		for (int d = 0; d < 10; d++) {
			System.out.println(d);
		}

		int e = 0;
		for (; e < 10;) {
			System.out.println(e);
			e++;
		}

		int f = 0;
		for (;;) {
			System.out.println(f);
			if (f >= 10) {
				break;
			}
			f++;
		}

		int j = 0;
		while (j < 10) {
			System.out.println(j);
			j++;
		}

		while (true) {
			System.out.println(j);
			if (j >= 10) {
				break;
			}
			j++;
		}

		int x = 100;
		do {
			System.out.println(x);
			x++;
		} while (x < 10);

		for (int i = 0; i < 100; ++i) {
			if (i > 10) {
				break;
			}
			System.out.println(i);
		}
		
		
		for(int w =0;w<100;w++) {
			if(w%2 ==0) {
				continue;
			}
			System.out.println(w);
		}
		
		
		for(int y =0;y<100;y++) {
			if(y%2 !=0) {
				continue;
			}
			System.out.println(y);
		}
		

	}
}
