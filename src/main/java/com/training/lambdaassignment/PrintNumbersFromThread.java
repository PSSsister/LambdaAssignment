package com.training.lambdaassignment;

import java.util.ArrayList;
import java.util.function.Consumer;

public class PrintNumbersFromThread {
	public static Object[] print(ArrayList<Integer> list) throws InterruptedException {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Thread t = new Thread(() -> {
			list.forEach( i -> arr.add(i));
		});
		t.start();
		t.join();
		return arr.toArray();	
	}

	public static Consumer<ArrayList<Integer>> threadPrint= list -> {
		int[] arr = new int[list.size()];
		Thread t = new Thread(() -> {
			int i = 0;
			while(i < list.size()) {
				arr[i] = list.get(i);
				i++;
			}
		});
		t.start();
	};


}
