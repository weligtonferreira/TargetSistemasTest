package main;

import java.util.Scanner;

public class InvertString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe uma palavra: ");
		String word = input.nextLine();
		
		String inverseWord = invertString(word);
		System.out.println(inverseWord);		
		
		input.close();
	}
	
	public static String invertString(String word) {
		int wordLength = word.length();
		
		char[] inverseArray = new char[wordLength];
		
		for (int i = wordLength, j = 0; i > 0; i--, j++) {
			inverseArray[i - 1] = word.charAt(j);
		}
		
		return new String(inverseArray);
	}

}
