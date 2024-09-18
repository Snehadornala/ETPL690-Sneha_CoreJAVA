package com.evergent.corejava.collections.map;

import java.util.HashMap;

public class HashmapDemo3 {
	public static void maoin(String args[]) {
		HashMap<String,String> capitalcities=new HashMap<>();
		capitalcities.put("India","Delhi");
		capitalcities.put("India","Delhi");
		capitalcities.put("Germany","Berlin");
		capitalcities.put("USA","Washington DC");
		System.out.println(capitalcities);
		for(String i:capitalcities.keySet()) {
			System.out.println(i);
		}
		
		
		
	}

}
