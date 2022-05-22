package b;

public class RaceCar extends Car {

	public RaceCar(int number) {
		super(number);
		this.km = 0;
	}

	@Override
	public int getSpeed() {
		return 1000;
	}

}
