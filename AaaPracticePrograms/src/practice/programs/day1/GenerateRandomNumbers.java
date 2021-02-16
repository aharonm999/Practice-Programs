package practice.programs.day1;

import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {

		// 1. Logic one
		
		Random ran = new Random();
		
		int r = ran.nextInt(100);
		System.out.println(r);
		
		// 2. Logic Two
		
		System.out.println(Math.random());
		
		// 3. Logic Three: Using Apache commons-lang API
		
	}

}
