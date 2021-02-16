package practice.programs.day1;

import java.util.Scanner;

public class FindingaLargestNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first no: ");
		int a = scn.nextInt();
		
		System.out.println("Enter second no: ");
		int b = scn.nextInt();
		
		System.out.println("Enter third no: ");
		int c = scn.nextInt();
		
		// 1. Logic One
		if(a>b && a>c)
		{
			System.out.println("a is largest number");
		}else if(b>a && b>c)
			System.out.println("b is largest number");
		else {
			System.out.println("c is largest number");
		}
		
		// 2. Logic Two - using ternary operator.
		
		int largest1 = a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest2+ "is largest number");
		
		
		
		
		
		
		
		
		
		
	}

}
