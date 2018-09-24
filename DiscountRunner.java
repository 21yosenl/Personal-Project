//� A+ Computer Science  -  www.apluscompsci.com
//Name - Yosen
//Date - September 17th 2018
//Class - A1
//Lab  - Discount Runner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n", Discount.getDiscountedBill(amt));
		

	}
}
