package exercises01_49;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("一番目の整数を入力してください。");
		int a = sc.nextInt();
		System.out.println("二番目の整数を入力してください。");
		int b = sc.nextInt();
		System.out.println("三番目の整数を入力してください。");
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("最大値は" + a + "です");
		} else if (b > a && b > c) {
			System.out.println("最大値は" + b + "です");
		} else {
			System.out.println("最大値は" + c + "です");
		}
	}

}
