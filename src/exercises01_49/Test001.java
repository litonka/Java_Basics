package exercises01_49;

import java.util.Scanner;

public class Test001 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("文字列を入力してください: ");
	    String inputString = scanner.nextLine();
	    System.out.print("除去する文字列を入力してください: ");
	    String removeString = scanner.nextLine();
	    String resultString = inputString.replace(removeString, "");
	    System.out.println("除去後の文字列: " + resultString);
	  }
	}

