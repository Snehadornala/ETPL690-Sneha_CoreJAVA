package com.evergent.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo4 {
	public static void main(String args[]) {
		TreeMap<Integer,String> studentRecords=new TreeMap<>();
		studentRecords.put(102, "Raju");
		studentRecords.put(101, "Bhanu");
		studentRecords.put(103, "Ramu");
		studentRecords.put(104, "David");
		System.out.println(studentRecords);
		System.out.println("studentRecords(Sort bi ID):");
		for(Map.Entry<Integer,String> entry:studentRecords.entrySet()) {
			System.out.println("ID:"+entry.getKey()+"Name:"+entry.getValue());
			
			
		}
		
	}

}
