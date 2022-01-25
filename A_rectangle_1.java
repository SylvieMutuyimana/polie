///importing java.util.* package in order to handle and accept inputs
import java.util.*;

///importing the java.text.* package so that inputs and values will be formatted as desired
import java.text.*;

/// creating the class A_rectangle_1
public class A_rectangle_1 {
	
	/// creating the main method
	public static void main(String[] args){
		
		/// creating the Scanner to allow arguments to passed 
		Scanner user_input = new Scanner(System.in);
		/// Printing to request for a user input
		System.out.println("Enter length in meters: ");
		/// Accepting the user input as float
		float length = user_input.nextFloat();
		/// Printing to request for another user input
		System.out.println ("Enter width in meters: ");
		/// Accepting the user input as float
		float width = user_input.nextFloat();
		
		/// calculating the area of the rectangle and naming the variable a double to allow all digits
		double area = length * width;
		/// calculating the perimeter of the rectangle and naming the variable a double to allow all digits
		double perimeter = 2*(length + width);
		
		/// Creating a format for the double values allowing only up to 2 decimals
		DecimalFormat double_value  = new DecimalFormat("0.00");
		
		///Printing the area
		/// Converting the double area type to short using explicit casting and printing the outcome
		System.out.println("the area of the rectangle using short data type : " + (short)(area));
		/// Converting the double area type to int using explicit casting and printing the outcome
		System.out.println("the area of the rectangle using int data type : " + (int)(area));
		/// Converting the double area type to long using implicit casting and printing the outcome
		System.out.println("the area of the rectangle using long data type : " + (long)(area));
		/// Printing the round off of the double area with only 2 decimals using DecimalFormat
		System.out.println("the area of the rectangle using double data type : " + double_value.format(area));
		
		///Printing the perimeter
		/// Converting the double perimeter type to short using explicit casting and printing the outcome
		System.out.println("the perimeter of the rectangle using short data type : " + (short)(perimeter));
		/// Converting the double perimeter type to int using explicit casting and printing the outcome
		System.out.println("the perimeter of the rectangle using int data type : " + (int)(perimeter));
		/// Converting the double perimeter type to long using implicit casting and printing the outcome
		System.out.println("the perimeter of the rectangle using long data type : " + (long)(perimeter));
		/// Printing the round off of the double perimeter with only 2 decimals using DecimalFormat
		System.out.println("the perimeter of the rectangle using double data type : " + double_value.format(perimeter));
	}
}
