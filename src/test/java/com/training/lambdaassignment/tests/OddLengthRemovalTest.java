package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.training.lambdaassignment.RemovalOfOddLength;

public class OddLengthRemovalTest {

	@Test
	public void testOddLengthRemoval() {
	    ArrayList<String> students = new ArrayList<String>(); 
        // Add Strings to list 
        // each string represents student name 
        students.add("Priyanka"); 
        students.add("Mohini"); 
        students.add("Soha"); 
        students.add("neeta"); 
        students.add("Shweta"); 
        
        String []expected= {"Priyanka", "Mohini", "Soha", "Shweta"};
        assertArrayEquals(expected,RemovalOfOddLength.OddLengthremove(students).toArray());
	}

}
