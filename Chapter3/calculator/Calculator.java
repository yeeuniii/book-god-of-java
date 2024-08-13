public class Calculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int num1 = 10;
		int num2 = 5;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		System.out.println("add = " + calculator.add(num1, num2));
		System.out.println("subtract = " + calculator.subtract(num1, num2));
		System.out.println("multiply = " + calculator.multiply(num1, num2));
		System.out.println("divide = " + calculator.divide(num1, num2));
	}

	public int add(int num1, int num2) {
			return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
			return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
			return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
			return num1 / num2;
	}
}
