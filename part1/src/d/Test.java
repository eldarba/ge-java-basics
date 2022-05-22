package d;

import d.State.Citizen;
import d.State.Flag;

public class Test {

	public static void main(String[] args) {
		State isr = new State("Israel");
		Flag flag = new Flag();
		
		Citizen c1 = isr.new Citizen("Moshe");
		
		System.out.println(c1.getName());
		System.out.println(c1.getStateName());

	}

}
