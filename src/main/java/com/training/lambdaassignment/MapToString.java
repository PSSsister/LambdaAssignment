package com.training.lambdaassignment;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapToString {

	
	public static StringBuilder convertMapToString(HashMap<String,String> map) {
		StringBuilder sb = new StringBuilder();
		Set<Entry<String, String>> s = map.entrySet();
		s.forEach(set -> {
			sb.append(set.getKey());
			sb.append(set.getValue());
		});
		return sb;

	}

}
