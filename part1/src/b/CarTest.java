package b;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car(101);
		Car c2 = new Car(102);
		
		System.out.println("car 1: " + c1.getNumber());
		System.out.println("car 2: " + c2.getNumber());
		
		System.out.println(Car.MAX_SPEED);
		System.out.println(Car.getCounter());
		

	}

}
