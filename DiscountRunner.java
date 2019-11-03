package ifs;
import ifs.Discount;
import java.util.Scanner;

public class DiscountRunner {
	public static void main (String args[] ) {
		
		//Create a new scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Find original cost
		System.out.print("Enter the original bill amount: ");
		double orig_cost = keyboard.nextDouble();
		
		Discount ref = new Discount();
		
		System.out.println("Bill after discount: " + ref.Discounted(orig_cost));
		
		
		
		
		
	}

}
