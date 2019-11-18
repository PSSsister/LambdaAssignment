package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.training.lambdaassignment.ModifiedString;

public class ModifiedStringTest {

	@Test
	public void test() {
		ArrayList<String> students = new ArrayList<String>(); 
        // Add Strings to list 
        // each string represents student name 
        students.add("Priyanka"); 
        students.add("Mohini"); 
        students.add("Spruha"); 
        students.add("Radha"); 
        students.add("Sheetal"); 
  
        String expected="PMSRS";
        assertEquals(expected,ModifiedString.modifystringFilter(students));
	}

}
