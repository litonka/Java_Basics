package exercises01_49;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("２つの整数を入力してください");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		if(num1==5||num2==5){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
