package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindingIntersectionUsingList {
	
	public static void main(String[] args) {
		int  arrayOne[] = {3,2,11,4,6,7};
		int arrayTwo[] = {1,2,8,4,9,7};
		List<Integer> listOne = new ArrayList<Integer>();
		List<Integer> listTwo = new ArrayList<Integer>();  
		List<Integer> resultList = new ArrayList<Integer>();
		for (Integer i : arrayOne) {
			listOne.add(i);	
		}
		
		for (Integer integer : arrayTwo) {
			listTwo.add(integer);
		}
		for (int i = 0; i < listOne.size(); i++) {
			for (int j = 0; j < listTwo.size(); j++) {
				if(listOne.get(i) == listTwo.get(j)) {
					resultList.add(listTwo.get(j));   //2, 4, 7
					break;
				}
			}
		}
		System.out.println("****Using List****");
		System.out.println("The instersection values are: ");
		for (Integer integer : resultList) {
			System.out.print(integer +" ");
			
		}
		System.out.println();
		System.out.println("****Using Set****");
		Set<Integer> firstSet = new LinkedHashSet<Integer>();
		Set<Integer> secondSet = new LinkedHashSet<Integer>();
		
		for (Integer integer : arrayOne) {
			firstSet.add(integer);
		}
		
		for (Integer integer : arrayTwo) {
			secondSet.add(integer);	
		}

		firstSet.retainAll(secondSet); // 2 4 7
		System.out.println("The intersection values are:");
		System.out.println(firstSet);
			
		
	}

}
