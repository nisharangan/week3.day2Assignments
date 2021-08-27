package week3.day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	// To remove duplicated characters(letters) in a given String using Set

	public static void main(String[] args) {
		String text = "PayPal India";
		text = text.toLowerCase();
		text = text.replaceAll("\\s", ""); // paypalindia

		char[] charArray = text.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if ((charSet.add(charArray[i])) == false)
				dupCharSet.add(charArray[i]);
		}
		System.out.println("The given string: " + text);
		System.out.println("After removing the duplicated characters:");
		for (Character ch : charSet) {
			System.out.print(ch + " ");

		}
		System.out.println();
		System.out.println("The duplicated characters are:");
		for (Character character : dupCharSet) {
			System.out.print(character + " ");
		}

	}

}
