package e.zoo;

public abstract class Animal {
	// attributes
	private int age;
	
	// CTORs
	public Animal() {
	}

	public Animal(int age) {
		super();
		this.age = age;
	}

	// abstract method
	public abstract void speak();

	// concrete methods (get / set)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
