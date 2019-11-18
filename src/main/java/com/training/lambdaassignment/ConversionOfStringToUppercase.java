package com.training.lambdaassignment;

import java.util.ArrayList;

public class ConversionOfStringToUppercase {

	
	public static ArrayList<String> convertToUppercase(ArrayList<String> data) {
		data.replaceAll(string -> string.toUpperCase());
		return data;
	}
}
