package exercises01_49;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int a = sc.nextInt();
		if (a >= 10 && a < 20) {
			System.out.println("入力された値は10以上20以下です");
		} else {
			System.out.println("入力された値は10未満または20より大きいです");

		}
	}

}
