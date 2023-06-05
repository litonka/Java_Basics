package exercises01_49;

import java.util.Scanner;

/**
 * ユーザーが入力した数までのフィボナッチ数列を表示するプログラムを作成してください。
 * @author liton
 *
 */
public class Exercise34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("フィボナッチ数列の個数を入れでください");
		int count = sc.nextInt();
		int a = 1;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 3; i <= count; i++) {
			int sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}

	}

}
