public class ControlOfFlow {
	public static void main(String[] args) {
		ControlOfFlow flow = new ControlOfFlow();

		System.out.println("switch문 실습");
		System.out.println("case1");
		flow.classifyVehicle(1);
		System.out.println("case3");
		flow.classifyVehicle(3);
		System.out.println("case4");
		flow.classifyVehicle(4);
		System.out.println("default");
		flow.classifyVehicle(10);
		System.out.println("-------------");
		System.out.println("while문 실습");
		flow.printAllMonth();
		System.out.println("\ndo-while문 실습");
		flow.gugudan(9);
		System.out.println("\nfor문 실습");
		flow.sum(10);
	}

	public void classifyVehicle(int numberOfWheel) {
		switch (numberOfWheel) {
			case 1:
				System.out.println("It is one foot bicycle.");
			case 2:
				System.out.println("It is a motor cycle or bicycle.");
			case 3:
				System.out.println("It is a three whell car.");
				break;
			case 4:
				System.out.println("It is a car.");
				break;
			default:
				System.out.println("It is an expensive car.");
				break;
		}
	}

	public void getDaysByMonth(int month) {
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println(month + " has 31 days");
				break;
			case 4, 6, 9, 11:
				System.out.println(month + " has 30 days");
				break;
			case 2:
				System.out.println(month + " has 28 or 29 days");
				break;
			default:
				System.out.println(month + " is not a valid month");
				break;
		}
	}

	public void printAllMonth() {
		int month = 0;

		while (month < 12) {
			month++;
			getDaysByMonth(month);
		}
	}

	public void gugudan(int dan) {
		int idx = 0;

		System.out.println(dan + "단");
		do {
			idx++;
			System.out.println(dan + " * " + idx + " = " + dan * idx);
		} while (idx < 9);
	}

	public void sum(int until) {
		int total = 0;

		for (int loop = 0; loop <= until; loop++) {
			total += loop;
		}
		System.out.println("1 to " + until + " = " + total);
	}
}
