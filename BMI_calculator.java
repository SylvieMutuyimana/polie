///importing java.util.* package in order to handle and accept inputs
import java.util.*;

///importing the java.text.* package so that inputs and values will be formatted as desired
import java.text.*;

/// creating the class BMI_calculator 
public class BMI_calculator {
	
	/// creating the main method
	public static void main(String[] args){
		
		/// creating the Scanner to allow arguments to passed 
		Scanner user_input = new Scanner(System.in);
		/// requesting for user input
		System.out.println("Enter Name:");
		/// Accepting the user input as string
		String Name = user_input.nextLine();
		/// calling for another input
		System.out.println("Enter height in meters squared: ");
		
		/// specifying the format to be used for the new inputs that should only have 2 decimals
		DecimalFormat value  = new DecimalFormat("0.00");
		
		/*Accepting the new input with Scanner, 
		 * formatting it to the desired format that was created 
		 * and parsing it to meet the variable type*/
		double height = Double.parseDouble(value.format(user_input.nextDouble()));
		
		/// repeating the same steps as the above
		System.out.println ("Enter weight(kg): ");
		double weight = Double.parseDouble(value.format(user_input.nextDouble()));
		
		/// calculating the BMI, formating it and parsing it to be a double with only 2 decimal points
		double BMI = Double.parseDouble(value.format(weight/height));
		
		///printing the outcome
		System.out.println("Name: " + Name);
		System.out.print("Height: " + height);
		System.out.println(" kgs ");
		System.out.print("Weight: " + weight);
		System.out.println(" m ");
		System.out.println("Your BMI is " + BMI);
	}

}
