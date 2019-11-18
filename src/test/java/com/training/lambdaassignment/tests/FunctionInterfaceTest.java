package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;



public class FunctionInterfaceTest {

	@Test
	public void testSupplier() {
	
		Supplier<String> supplier = () -> "Hello from Supplier!";
	    String expected="Hello from Supplier!";
		assertEquals(expected,supplier.get());
	}

	@Test
	public void testPredicateWhichReturnTrue() {
		//even number test
		Predicate<Integer> predicate = num -> num%2==0;
		assertEquals(true,predicate.test(24));
	}

	@Test
	public void testPredicateWhichReturnFalse() {
		Predicate<Integer> predicate = num -> num%2==0;
		assertEquals(false,predicate.test(15));
	}
	@Test
	public void testBifunction() {
		BiFunction<Integer, Integer, Integer> maxFunction = (x,y)->x>y?x:y;
		int expected=25;
		int result = maxFunction.apply(20, 25);
		assertEquals(expected, result);

	}
	@Test
	public void testFunction() {
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(67);
		arrList.add(90);
		arrList.add(88);
		arrList.add(7);
		
		ArrayList <Integer> arrList1=new ArrayList<>();
		
		
		
	}
	
	



}
