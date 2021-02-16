package practice.programs.day1;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String str = s.next();
		String org_str=str;
		
		String rev= "";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(org_str.equals(rev)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
		
		
		
		
		
	}

}
