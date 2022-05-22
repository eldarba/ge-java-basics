package e.zoo;

public interface Flyer {
	
	// constants
	int MAX_ALTITUDE = 100;
	
	// abstract methods
	void fly();
	
	// methods with default implementation
	default void land() {
		System.out.println("flyer is landing");
	}

}
