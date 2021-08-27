package week3.day2Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArrayUsingList {

	public static void main(String[] args) {
		int[] arrNum = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> listArray = new ArrayList<Integer>();
		List<Integer> dupList = new ArrayList<Integer>();
		for (Integer i : arrNum) {
			listArray.add(i);
		}
		System.out.println("Using List");
		for (int i = 0; i < listArray.size(); i++) {
			for (int j = i+1; j < listArray.size(); j++) {
				if(listArray.get(i).equals(listArray.get(j))) {
					dupList.add(listArray.get(j));
					listArray.remove(j);	
				}
			}
		}
		System.out.println("The given array without duplication: ");
		System.out.println(listArray);
		System.out.println("The duplicated values are: ");
		System.out.println(dupList);
		
		System.out.println("*****Using Set*****");
		Set<Integer> setArray = new LinkedHashSet<Integer>();
		Set<Integer> dupArray = new LinkedHashSet<Integer>();
		for (Integer i : arrNum) {
			if(setArray.add(i)==false) {
				dupArray.add(i);
			}
			
		}
		System.out.println("The given array without duplication: ");
		System.out.println(setArray);
		System.out.println("The duplicated values are: ");
		System.out.println(dupArray);
		}
	}


