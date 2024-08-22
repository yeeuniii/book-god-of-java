public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager salaryManger = new SalaryManager();
		System.out.println(salaryManger.getMonthlySalary(20000000));
	}

	public double getMonthlySalary(int yearlySalary) {
		double montlySalary = yearlySalary / 12.0;	
		double tax = calculateTax(montlySalary);
		double nationalPension = calculateNationalPension(montlySalary);
		double healthInsurance = calculateHealthInsurance(montlySalary);
		double totalTax = tax + nationalPension + healthInsurance;
		montlySalary -= totalTax;
		return montlySalary;
	}

	public double calculateTax(double monthlySalary) {
		double tax = monthlySalary * 0.125;
		System.out.println("Tax is " + tax);
		return tax;
	}

	public double calculateNationalPension(double monthlySalary) {
		double nationalPension = monthlySalary * 0.081;
		System.out.println("National pension is " + nationalPension);
		return nationalPension;
	}

	public double calculateHealthInsurance(double monthlySalary) {
		double healthInsurance = monthlySalary * 0.135;
		System.out.println("Health insurance is " + healthInsurance);
		return healthInsurance;
	}
}
