package exercises01_49;

import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("２つの整数を入力してください");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + "は大きいです");
		} else if (num2 > num1) {
			System.out.println(num2 + "は大きいです");
		} else {
			System.out.println(num2 + "と" + num2 + "等しいです");
		}

	}

}
