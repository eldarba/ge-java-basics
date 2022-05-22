package b;

public class Car {

	// dynamic instance variables
	private final int number;// final attribute
	protected int km;
	private int speed;

	// static - class variable
	private static int counter;
	// final + static = constant
	public static final int MAX_SPEED = 110;
	
	public Car(int number) {
		super();
		this.number = number;
		counter++;
	}


	public static int getCounter() {
		return counter;
	}


	public int getNumber() {
		return number;
	}



	public final int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
