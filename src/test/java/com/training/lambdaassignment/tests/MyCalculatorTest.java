package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.lambdaassignment.MyArithmeticCalculator;
import com.training.lambdaassignment.MyCalculator;
import com.training.lambdaassignment.exceptions.ExceedRangeException;

public class MyCalculatorTest {
   // MyArithmeticCalculator mycal=new MyArithmeticCalculator() ;
    
	@Test(expected=ExceedRangeException.class)
	public void testCalculateAdd() {
		MyArithmeticCalculator.add.calculate(2147483647,2147483647);

	}
	
	@Test
	public void testCalculateAddWithValidNumber() {
		assertEquals(134,MyArithmeticCalculator.add.calculate(56,78));

	}

    @Test
	public void testCalculateSubtract() {
	
	
		assertEquals(10,MyArithmeticCalculator.sub.calculate(80,70));
	}
	
	@Test
	public void testCalculateMultiply() {
		
		assertEquals(1035,MyArithmeticCalculator.myCalMultiply.calculate(23, 45));
	}	
	
	
	@Test(expected=ExceedRangeException.class)
	public void testCalculateMultiplyWithLargeNumber() {
		
		MyArithmeticCalculator.myCalMultiply.calculate(2147483647, 2147483647);
	}	
	
	@Test(expected=ArithmeticException.class)
	public void testCalculateDivisionwhichThrowsException() {
		
		MyArithmeticCalculator.myCalDivision.calculate(45, 0);
	}
	

	public void testCalculateDivision() {
		
		assertEquals(5,MyArithmeticCalculator.myCalDivision.calculate(45, 9));
	}

}
