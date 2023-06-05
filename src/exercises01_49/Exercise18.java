package exercises01_49;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("数字を入力してください。");
			int i = sc.nextInt();
			if (i > 0) {
				System.out.println(i + "は正の数です");
			} else if (i < 0) {
				System.out.println(i + "は負の数です");
			} else {
				System.out.println(i + "は0です");
			}
		}

	}

}
