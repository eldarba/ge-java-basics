package d.threads.cars;

public class Car {

	private int id;
	private int km;

	private final Object m1 = new Object();
	private final Object m2 = new Object();

	public Car(int id) {
		super();
		this.id = id;
	}

	public synchronized void drive(int distance) {
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

	public void f1() {
		synchronized (m1) {
			System.out.println(Thread.currentThread().getName() + " started f1");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " finished f1");
		}
	}

	public void f2() {
		synchronized (m2) {
			System.out.println(Thread.currentThread().getName() + " started f2");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " finished f2");
		}

	}

}
