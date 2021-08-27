package week3.day2Assignments;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RmvDuplicatesUsingSetInStrings {

	public static void main(String[] args) {
		String str = "we learn java basics as part of java sessions in java week1 sessions";

		String[] splitStr = str.split(" ");
		System.out.println("*****Using List*****");
		// List<String> strList = new ArrayList<String>(Arrays.asList(splitStr)); -- not
		// needed to convert a String into List
		List<String> strList = new ArrayList<String>();
		List<String> dupList = new ArrayList<String>();
		for (String string : splitStr) {
			strList.add(string);
		}

		int count = 1;
		for (int i = 0; i < strList.size(); i++) {
			for (int j = i + 1; j < strList.size(); j++) {
				if (strList.get(i).equals(strList.get(j))) {
					dupList.add(strList.get(j));
					strList.remove(j);
					count = count + 1;
				}
			}
		}
		System.out.println("***The String without duplication:***");
		for (String string : strList) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println("***Duplicated words are:***");
		for (String string : dupList) {

			System.out.print(string + " ");
		}

		System.out.println();
		System.out.println("*****Using Set*****");
		Set<String> strNewSet = new LinkedHashSet<String>();
		Set<String> dupSet = new LinkedHashSet<String>();
		for (String eachString : splitStr) {
			if (strNewSet.add(eachString) == false) {
				dupSet.add(eachString);
			}
		}
		System.out.println("***The String without duplication:***");
		for (String word : strNewSet) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println("***The duplicated words are:***");
		for (String string : dupSet) {
			System.out.print(string + " ");

		}

		/*
		 * Set<String> strSet = new LinkedHashSet<String>(Arrays.asList(splitStr));
		 * System.out.println(strSet); Iterator<String> itr = strSet.iterator();
		 *  while(itr.hasNext()) { 
		 *  System.out.print(itr.next()+" ");
		 * 
		 * }
		 */

	}
}
