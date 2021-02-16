package practice.programs.day1;

import java.util.Scanner;

public class CountSumofDigitsInaNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int i = scn.nextInt();
		int sum = 0;
		
		while(i>0) {
			sum = sum+i%10;
			i = i/10;
		}
		System.out.println("Sum of digits of a given no: "+ sum);
	}

}
