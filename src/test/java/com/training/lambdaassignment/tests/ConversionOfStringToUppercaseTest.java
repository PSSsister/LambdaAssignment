package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.training.lambdaassignment.ConversionOfStringToUppercase;

public class ConversionOfStringToUppercaseTest {

	@Test
	public void testConversionOfStringToUppercase() {
		 ArrayList<String> students = new ArrayList<String>(); 
	        // Add Strings to list 
	        // each string represents student name 
	        students.add("Priyanka"); 
	        students.add("Mohini"); 
	        students.add("Spruha"); 
	        students.add("Radha"); 
	        students.add("Sheetal"); 
	  
	  
		   String expected[]= {"PRIYANKA","MOHINI","SPRUHA","RADHA","SHEETAL"};
	       assertArrayEquals(expected,ConversionOfStringToUppercase.convertToUppercase(students).toArray());
	     
		
	    
	}

}
