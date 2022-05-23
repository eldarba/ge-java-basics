package d.threads.cars;

public class Car {

	private int id;
	private int km;

	public Car(int id) {
		super();
		this.id = id;
	}

	public void drive(int distance) {
		String driver = Thread.currentThread().getName();
		System.out.println(driver + " started with car " + id + ", km= " + km + " for a distance of " + distance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.km += distance;
		System.out.println(driver + " finished with car " + id + ", km= " + km);
	}

}
