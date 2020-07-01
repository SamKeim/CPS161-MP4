package roman_calculator;
import java.util.Scanner;

public class RomanCalculator {
	public static Scanner kbInput = new Scanner(System.in);

	public static String doMath(char operator, int firstNum, int secondNum) {
		/*
		 * This method will perform the arithmetic
		 * indicated by the operator (+ -* /),
		 * invoke convertToRoman to convert answer to Roman number,
		 * then return answer
		 * */
		return null;
	}

	public static char getOperator() {
		System.out.println("please choose an operator: +, - , * , or /");
		return kbInput.next().charAt(0);
	}

	public static int getOperands() {
	/*This routine should prompt the user to enter Roman number. 
	  convertFromRoman needs to be invoked to convert the Roman number to an integer.
	  If the input is invalid (-1 returned from convertFromRoman)
	  then complain and prompt the user again. 
	*/ 
		return 0;
	}
	public static int convertFromRoman(String romanNum) {
		/*
		 * This method will convert Roman number to integer
		 * return -1 when input is invalid
		 * 
		 * */
		return 0;
	}
	public static String convertToRoman(int num) {
		/*
		 * This method will convert integer to Roman number
		 * */
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		do {

			result = doMath(getOperator(), getOperands(), getOperands());

			System.out.println(result);
			System.out.println("do you want to continue? y/n");
			kbInput.nextLine();
		} while (kbInput.nextLine().charAt(0) == 'y');
		System.out.println("Have a nice day!");
	}

}