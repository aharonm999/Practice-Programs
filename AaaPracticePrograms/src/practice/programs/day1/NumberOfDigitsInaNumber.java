package practice.programs.day1;

import java.util.Scanner;

public class NumberOfDigitsInaNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int i = scn.nextInt();
		int count = 0;
		
		while(i>0) {
			i = i/10;
			count++;
		}
		
		System.out.println("Number of digits in a number is:" + count);
	}

}
