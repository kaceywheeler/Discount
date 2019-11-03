package ifs;

public class Discount {
	
	public double Discounted(double orig_cost) {
		double cost;
		
		//Apply discount if greater than 2000
		if (orig_cost > 2000) {
			cost = Math.round((orig_cost - (orig_cost * .15))*100)/100.0;
		}
		
		//Don't apply discount if less than 2000
		else {
			cost = Math.round((orig_cost) * 100)/100.0;
		}
		
		
		//Return new cost
		return cost;
	}
	

}
