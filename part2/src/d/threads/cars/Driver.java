package d.threads.cars;

public class Driver extends Thread {

	private Car car;
	private int distance;

	public Driver(String name, Car car, int distance) {
		super(name);
		this.car = car;
		this.distance = distance;
	}

	@Override
	public void run() {
		car.drive(distance);
	}

}
