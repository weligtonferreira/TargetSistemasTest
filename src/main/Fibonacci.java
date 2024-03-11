package main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number, actualValue;
		String message;
		boolean isPresent = false;
		
		System.out.print("Informe um número: ");
		number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			actualValue = fibonacci(i);
			
			System.out.print(actualValue + " ");
			
			if (actualValue == number) {
				isPresent = true;
				break;
			}
			
			if (actualValue > number) {
				break;
			}
		}
		
		if (isPresent) {
			message = "O numero " + number + " está presente.";
		} else {
			message = "O numero " + number + " não está presente.";
		}
		
		System.out.println("\n" + message);
		
		input.close();
	}
	
	public static int fibonacci(int num) {
		if (num < 2) return 1;
		
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
