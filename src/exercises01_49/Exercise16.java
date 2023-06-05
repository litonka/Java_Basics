package exercises01_49;

import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("条件式を入力してください:");
		boolean condition = sc.nextBoolean();

		if (condition) {
			System.out.println("正解");
		}
	}
}
