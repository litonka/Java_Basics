package exercises01_49;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("２つの数値を入力してください");
			int num1 =sc.nextInt();
			int num2 =sc.nextInt();
			if(num1>0&&num2<0||num1<0&&num2>0){
				System.out.println("true");
			}else {
				System.out.println("false");
			}*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("２つの数値を入力してください");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		boolean result =false;
		if(num1>0&&num2<0||num1<0&&num2>0){
			result=true;
		}
			System.out.println(result);
		

	}

}
