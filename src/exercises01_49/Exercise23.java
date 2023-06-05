package exercises01_49;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("入力された値は偶数です");
		} else {
			System.out.println("入力された値は奇数です");
		}

	}

}
