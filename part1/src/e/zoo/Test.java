package e.zoo;

public class Test {

	public static void main(String[] args) {
		
		Animal animal;
		
		animal = new Dog();
		animal.speak();
	
		animal = new Ostrich();
		animal.speak();
		
		System.out.println("============");
		animal = new Hawk();
		animal.speak();
		if(animal instanceof Flyer) {
			((Flyer)animal).fly();
		}

	}

}
