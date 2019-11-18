package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.training.lambdaassignment.MapToString;

public class MapToStringTest {

	@Test
	public void testMapToStringConversion() {
		HashMap<String,String> hmap=new HashMap<>();
		hmap.put("shop", "keeper");
	
		String expected="shopkeeper";
		assertEquals(expected,MapToString.convertMapToString(hmap).toString());


	}

}
