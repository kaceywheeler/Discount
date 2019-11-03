package ifs;
//Import Discount class
import ifs.Discount;
//Import scanner 
import java.util.Scanner;

public class DiscountRunner {
	public static void main (String args[] ) {
		
		//Create a new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Find original cost
		System.out.print("Enter the original bill amount: ");
		double orig_cost = keyboard.nextDouble();
		
		//Creat new object
		Discount ref = new Discount();
		
		//Call method and print output
		System.out.println("Bill after discount: " + ref.Discounted(orig_cost));
		
		
		
		
		
	}

}
