package roman_calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorMethods {
	private static Scanner scn = new Scanner(System.in);
	private static LinkedHashMap<Integer, Character> key = generateKey();
		
	/**
	 * @param none
	 * @return Map<Integer, Character> containing the key-value pairs of the Roman Number system.
	 */
	public static LinkedHashMap<Integer, Character> generateKey() {
		LinkedHashMap<Integer, Character> key = new LinkedHashMap<Integer, Character>();
		for (int i = 0; i < 7; i++) {
			switch (i) {
			case 0:
				key.put(1000, 'M');
				break;
			case 1:
				key.put(500, 'D');
				break;
			case 2:
				key.put(100, 'C');
				break;
			case 3:
				key.put(50, 'L');
				break;
			case 4:
				key.put(10, 'X');
				break;
			case 5:
				key.put(5, 'V');
				break;
			case 6:
				key.put(1, 'I');
				break;
			default:
				break;
			}
		}
		return key;
	}

	/**
	 *	Takes in a String Roman Number, converts to int
	 * @param roman number
	 * @return int
	 */
	public int romanToInt(String roman) {
		roman = roman.toUpperCase();
		int returnInt = 0;
		for (int i = 0; i < roman.length(); i++) {
			char c = roman.charAt(i);
			if(!key.containsValue(c)) {
				return -1;
			}
			for (Map.Entry<Integer, Character> entry : key.entrySet()) {
				if(c == entry.getValue()) {
					returnInt += entry.getKey();
				}
			}
		}
		return returnInt;
	}

	/**
	 * Takes in a number and returns Roman Number equivalent
	 * @param number to convert
	 * @return number as Roman Number string
	 */
	public String intToRoman(int number) {
		String returnString = "";

		for(Map.Entry<Integer, Character> entry : key.entrySet()) {	
			int value = number / entry.getKey();
			if(value >= 1) {
				for(int i = 0; i < value; i++) {
					returnString += entry.getValue();
				}
			}
			number = number % entry.getKey();
		}

		return returnString;
	}
	
	/**
	 * Gets user input for Operand, checks validity. Exit condition available.
	 * @return Valid Operand as char. Returns 'E' on exit.
	 */
	public char getOperand() {
		System.out.print("Operator ( + - * / ) or EXIT : ");
		String input = scn.nextLine();
		
		if(input.equalsIgnoreCase("EXIT")) {
			return 'E';
		}
		
		char operand = input.charAt(0);
		if (!(operand == '+' || operand == '-' || 
				operand == '*' || operand == '/')) {
			System.out.println("Invalid Operand. Please try again.");
			operand = getOperand();
		}
		return operand;
	}
	
	public String getValidRomanNumber() {
		System.out.print("Enter number: ");
		String romanNumber = scn.nextLine();
		if(romanToInt(romanNumber) == -1) {
			System.out.println("Invalid number. Please try again.");
			romanNumber = getValidRomanNumber();
		}
		return romanNumber;
	}
	
	/**
	 * Adds given numbers
	 * @param romanA - First number to add
	 * @param romanB - Second number to add
	 * @return answer as Roman number
	 */
	public String addition(String romanA, String romanB) {
		return intToRoman(romanToInt(romanA) + romanToInt(romanB));
	}
	
	/**
	 * Subtracts given numbers
	 * @param romanA - First number to subtract
	 * @param romanB - Second number to subtract
	 * @return answer as Roman number
	 */
	public String subtraction(String romanA, String romanB) {
		return intToRoman(romanToInt(romanA) - romanToInt(romanB));
	}
	
	/**
	 * Multiplies given numbers
	 * @param romanA - First number to multiply
	 * @param romanB - Second number to multiply
	 * @return answer as Roman number
	 */
	public String multiplication(String romanA, String romanB) {
		return intToRoman(romanToInt(romanA) * romanToInt(romanB));
	}
	
	/**
	 * Divides given numbers
	 * @param romanA - First number to divide
	 * @param romanB - Second number to divide
	 * @return answer as Roman number
	 */
	public String division(String romanA, String romanB) {
		return intToRoman(romanToInt(romanA) / romanToInt(romanB));
	}

}
