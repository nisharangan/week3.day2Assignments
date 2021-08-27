package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,6,8};
		List<Integer> listArray = new ArrayList<Integer>();
		for (Integer integer : arr) {
			listArray.add(integer);	//All the array elements are added to List
		}
		Collections.sort(listArray); //List is sorted as [1,2,3,4,6,7,8]
		for (int i = 0; i < listArray.size(); i++) {
			if(listArray.get(i) != i+1) {
				System.out.println("The missing number is: " +(i+1));
				break;
			}
			
		}

	}

}
