package com.ib.p01_arraystring;

public class LP6MReverseWord {

	public static void main(String[] args) {
		new Solution6().reverseWords("the sky    is blue"); //"blue is sky the"
	}
}

class Solution6 {
	/**
	 * Approach:
	 * 	split the sentence with String split method on basis of " "
	 * 	we get splited words arrays it will have all the words combined with some blank words
	 * 	reverse the order of words by using loop in reverse:: only append if word is not empty
	 * 	at last return the string wait you forgot the trailing space (trim that)
	 *
	 * @param s : sentence string where words are to be reversed
	 * @return String of reversed word
	 */
	public String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		String[] strArr = s.split(" ");
		for (int i = strArr.length - 1; i >= 0; i--) {
			String str = strArr[i];
			if (!str.isEmpty())
				result.append(str).append(" ");
		}
		System.out.println(result.toString().trim());
		return result.toString().trim();
	}
}