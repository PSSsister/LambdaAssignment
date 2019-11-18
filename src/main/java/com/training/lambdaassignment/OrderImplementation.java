package com.training.lambdaassignment;

import com.training.lambdaassignment.exceptions.InvalidInputException;

public class OrderImplementation {

	
	
	public static Order print=(x,s)->{
		if(x>10000  &&  (s.equals("ACCEPTED") || s.equals("COMPLETED")))
		{
		    return "Price : "+x +" and Order Status is : "+s;
		}
		else
		{
			throw new InvalidInputException("Please enter price which is greater than 100000 and Status should be ACCEPTED OR COMPLETED");
		}
	};
}
