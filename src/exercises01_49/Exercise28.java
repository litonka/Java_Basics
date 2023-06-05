package exercises01_49;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int a = sc.nextInt();
		if (a >= 0 && a < 100) {
			System.out.println("0以上100以下の範囲にあります。");
		} else if (a < 0) {
			System.out.println("0未満です。");
		} else {
			System.out.println("100より大きいです。");
		}
	}

}
