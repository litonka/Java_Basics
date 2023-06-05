package exercises01_49;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("一番目の数値を入力してください");
		int a =sc.nextInt();
		System.out.println("二番目の数値を入力してください");
		int b=sc.nextInt();
		System.out.println("一番目の演算子を入力してください");
		String c =sc.next();
		
		System.out.println(a+c+b);
	}

}
