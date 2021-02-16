package practice.programs.day1;

public class SwappingTwoNumbers {

/* Swapping in 5 different ways*/
	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values of a and b are:" +a+"  "+b);
		
		// 1. Logic One: Using Temp/third variable
		/*int temp = a;
		b=a;
		b=temp;*/
		
		// 2. Logic Two: using + and - operators. [i.e without using temp/third variable]
		
		/*a = a+b; // 10+20 = 30
		b = a-b; // 30-20 = 10
		a = a-b; // 30-10 = 20 */	
		
		// 3. Logic Three: using * and / operators. [i.e without using temp/third variable]
		// Here a & b values should not be zero
		
		/*a = a*b; //10*20 = 200
		b = a/b; //200/20 = 10
		a = a/b; //200/10 = 20
*/		
		// 4. Logic Four: Using Bitwise XOR (^)
		
/*		a = a^b; //10^20=30
		b = a^b; //30^20=10
		a = a^b; //30^10=20
*/		
		// 5. Logic Five: Single statement
		
		b = a+b -(a=b);
		
		System.out.println("after swapping values of a and b are:" +a+"  "+b);
	}

}
