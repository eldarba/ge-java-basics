package d.threads.cars;

public class Test2 {

	public static void main(String[] args) {
		
		Car car1 = new Car(101);
		
		DriverF moshe = new DriverF("Moshe", car1, true);
		DriverF rina = new DriverF("Rina", car1, false);
		moshe.start();
		rina.start();

	}

}
