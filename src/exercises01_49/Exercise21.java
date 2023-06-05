package exercises01_49;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("正の数です");
		}else if (a<0){
			System.out.println("負の数です");
		}else {
			System.out.println("0です");
		}

	}

}
