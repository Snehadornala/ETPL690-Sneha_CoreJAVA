package com.evergent.corejava.Strings1;

public class SplitDemo1 {
	public static void main(String args[]) {
		String str="Java is a powerfullanguage";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
			System.out.println(words[i]);
		//for each adv loop
		for(String w:words) {
			System.out.println(w);
		}
	}

}
