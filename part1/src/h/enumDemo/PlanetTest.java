package h.enumDemo;

import java.util.Arrays;
import java.util.Scanner;

public class PlanetTest {

	public static void main(String[] args) {
		
		System.out.println("enter planet name " + Arrays.toString(Planet.values()));
		Scanner sc = new Scanner(System.in);
		
		Planet planet = Planet.valueOf(sc.nextLine()); 
		System.out.println(planet);
		System.out.println("mass: " + planet.getMass());
		System.out.println("orbit: " + planet.getOrbit());
		
		sc.close();

	}

}
