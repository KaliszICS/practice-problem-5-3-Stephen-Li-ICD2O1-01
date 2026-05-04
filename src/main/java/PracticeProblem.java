/*
File: Lesson 5.3 - Add/remove
Author: Stephen Li
Date Created: May 1, 2026
Date Last Modified: May 4, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString(String[] array1, String word1, int index) {
		String[] array2 = new String[array1.length + 1];
		int j = 0;
		for (int i = 0; i < array2.length; i++) {
			if (i == index) {
				array2[i] = word1;
			}
			else {
				array2[i] = array1[j];
				j++;
			}
		}
		return array2;
	}

	public static char[] removeChars(char[] array1, char a) {
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != a) {
				count++;
			}
		}
		char [] array2 = new char[count];
		int j = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != a) {
				array2[j] = array1[i];
				j++;
			}
		}
		return array2;
	}
}
