package com.training.lambdaassignment;

import com.training.lambdaassignment.exceptions.ExceedRangeException;


public class MyArithmeticCalculator {
	
	    public static MyCalculator add = (num1,num2)->{
		
			if(num1+num2>Integer.MAX_VALUE)
			{
				throw new ExceedRangeException("The result exceeding the max value range.");
			}
		
		  return (int) (num1 + num2);
		};

         public static MyCalculator sub=(num1,num2)->{
			
	        
			if(num1-num2>Integer.MAX_VALUE)
			{
				throw new ExceedRangeException("The result exceeding the max value range.");
			}
		
		  return (int) (num1-num2);
		};

		public static MyCalculator myCalMultiply=(num1,num2)->{
   		   
			if(num1*num2>Integer.MAX_VALUE)
 			{
				throw new ExceedRangeException("The result exceeding the max value range.");
			}
			return (int) (num1*num2);
		};
		
	   	public static MyCalculator myCalDivision=(num1,num2)->{
			if(num2==0)
			{
				throw new ArithmeticException("Division by zero exception");
		    }
		    if(num1/num2>Integer.MAX_VALUE)
		    {
				throw new ExceedRangeException("The result exceeding the max value range.");
			}
			return (int) (num1/num2);
		};
	
		

}
