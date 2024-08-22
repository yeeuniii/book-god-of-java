public class IntegerManager {
	public static void main(String[] args) {
		IntegerManager integerManager = new IntegerManager();

		long principal = 1000000;
		for (int day = 1; day <= 365; day += 10) { double amount = integerManager.calculateAmount(day, principal);
			System.out.println("After " + day + ", the interest is " + (amount - principal));
		}
	}

	public double getInterestRate(int day) {
		if (day >= 1 && day <= 90) {
			return 0.005;
		}
		if (day >= 91 && day <= 180) {
			return 0.01;
		}
		if (day >= 181 && day <= 364) {
			return 0.02;
		}
		return 0.056;
	}

	public double calculateAmount(int day, long amount) {
		return amount * (1 + getInterestRate(day));
	}
}
