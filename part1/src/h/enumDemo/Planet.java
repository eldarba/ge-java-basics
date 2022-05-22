package h.enumDemo;

public enum Planet {
	
	MERCURY(3, 1500), MARS(4, 2000), EARTH(6, 4000), VENUS(7, 5000);
	
	// attributes
	private int mass;
	private int orbit;
	
	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	public int getMass() {
		return mass;
	}

	public int getOrbit() {
		return orbit;
	}
	
	
	
	

}
