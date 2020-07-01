package roman_calculator;

public class CalculatorApplication {
	
	public static void main(String args[]) {
		CalculatorMethods calculator = new CalculatorMethods();
		char operand = calculator.getOperand();
		while (operand != 'E') {
			
			String numberA = calculator.getValidRomanNumber();
			String numberB = calculator.getValidRomanNumber();
			String answer = "";
			
			switch(operand) {
			case '+':
				answer = calculator.addition(numberA, numberB);
				break;
			case '-':
				answer = calculator.subtraction(numberA, numberB);
				break;
			case '*':
				answer = calculator.multiplication(numberA, numberB);
				break;
			case '/':
				answer = calculator.division(numberA, numberB);
				break;
			default:
				System.out.println("Error. Please restart.");
				break;
			}
			System.out.println("Answer : " + answer + "\n");
			operand = calculator.getOperand();
		}
		System.out.println("Thank you. Goodbye.");
	}

}
