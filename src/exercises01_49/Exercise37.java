package exercises01_49;

import java.util.Scanner;

/**
 * ユーザーが入力した文字列から、指定した文字列を除去するプログラムを作成してください。
 * @author liton
 *
 */
public class Exercise37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字列を入れでください");
		String a = sc.next();
		System.out.println("除去する文字列を入れでください");
		String b = sc.next();
		//replace(from, to) 
		String result = a.replace(b, "");
		System.out.println(result);

	}

}
