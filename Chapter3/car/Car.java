public class Car {
	private String color;
	private int speed;
	private int distance;

	public Car() {

	}

	public void speedUp(int amount) {
		speed += amount;
	}

	public void breakDown(int amount) {
		speed -= amount;
		if (speed < 0) {
			speed = 0;
		}
	}

	public int getCurrentSpeed() {
		return speed;
	}
}
