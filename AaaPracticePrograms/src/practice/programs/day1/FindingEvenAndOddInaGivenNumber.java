package practice.programs.day1;

import java.util.Scanner;

public class FindingEvenAndOddInaGivenNumber {

	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a number: ");
	
	int i = scn.nextInt();
	int even_count = 0;
	int odd_count = 0;
	
	while(i>0) 
	{
		int rem = i%10;
		
		if(rem%2==0) 
		{
			even_count++;
		}
		else
		{
			odd_count++;
		}
			i=i/10;
			
	}
	
	System.out.println("Number of Even numbers are:"+ even_count);
	System.out.println("Number of Odd numbers are:"+ odd_count);
	
	}

}
