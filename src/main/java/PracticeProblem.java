/*
File: Lesson 5.3 - Add/remove
Author: Stephen Li
Date Created: May 1, 2026
Date Last Modified: May 1, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] array1, String word1, int num1) {
		String[] array2 = new String[array1.length + 1];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		array2[num1] = word1;
		return array2;
	}

	public static char[] removeChars(char[] array1, char a) {
		for (int i = 0; i < array1.length; i++) {
			if (a == array1[i]) {
				array1[i] = "";
			}
		}
		return array1;
	}
}
