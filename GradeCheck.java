//� A+ Computer Science  -  www.apluscompsci.com
//Name - Yosen Lin
//Date - September 21st 2018
//Class - APCS A1
//Lab  - GradeCheck

import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner (System.in);
        System.out.print("Enter your grade :: ");
        int Grades = input.nextInt();
        Grade test = new Grade(Grades);
        System.out.println(test);
	}
}