public class CarManager {
	public static void main(String[] args) {
		Car myCar = new Car();
	
		myCar.speedUp(10);
		System.out.print("My car`s current speed : ");
		System.out.println(myCar.getCurrentSpeed());
		myCar.breakDown(100);
		System.out.print("My car`s current speed : ");
		System.out.println(myCar.getCurrentSpeed());
	}
}
