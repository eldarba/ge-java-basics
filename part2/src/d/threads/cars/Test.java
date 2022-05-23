package d.threads.cars;

public class Test {

	public static void main(String[] args) {
		
		Car car1 = new Car(101);
		
		Driver moshe = new Driver("Moshe", car1, 150);
		Driver rina = new Driver("Rina", car1, 200);
		moshe.start();
		rina.start();

	}

}
