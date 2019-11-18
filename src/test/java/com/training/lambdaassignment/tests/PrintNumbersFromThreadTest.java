package com.training.lambdaassignment.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.training.lambdaassignment.PrintNumbersFromThread;

public class PrintNumbersFromThreadTest {

		@Test
		public void testMethodWithValidInput() throws InterruptedException {
			ArrayList<Integer> arrList=new ArrayList<Integer>();
			arrList.add(56);
			arrList.add(78);
			arrList.add(590);
			arrList.add(876);

			Integer[] expected = {56,78,590,876};
		    assertArrayEquals(expected,PrintNumbersFromThread.print(arrList));
			
		}


	}


