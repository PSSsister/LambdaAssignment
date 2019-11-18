package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.lambdaassignment.OrderImplementation;
import com.training.lambdaassignment.exceptions.InvalidInputException;

public class OrderTest {

	@Test
	public void testOrderPrint() {
	 String expected="Price : 20000.0 and Order Status is : COMPLETED";
	 
	 System.out.println(OrderImplementation.print.printOrder(20000, "COMPLETED"));
	 assertEquals(expected,OrderImplementation.print.printOrder(20000, "COMPLETED"));
	}

	@Test(expected=InvalidInputException.class)
	public void testOrderPrintWithPriceLessThanTenThousandAndStatusIsCompletedAndAccepted() {
		 OrderImplementation.print.printOrder(5000, "COMPLETED");
		}

}
