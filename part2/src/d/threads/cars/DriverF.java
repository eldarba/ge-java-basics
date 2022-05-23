package d.threads.cars;

public class DriverF extends Thread {

	private Car car;
	private boolean f1;

	public DriverF(String name, Car car, boolean f1) {
		super(name);
		this.car = car;
		this.f1 = f1;
	}

	@Override
	public void run() {
		if(f1) {
			car.f1();
		}else {
			car.f2();
		}
	}

}
