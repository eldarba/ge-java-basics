package g.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		
		// LinkedHashSet is ordered
		Set<String> set = new LinkedHashSet<>();
		set.add("Math");
		set.add("Java");
		set.add("English");
		
		System.out.println(set);
		
//		System.out.println(set.get(0));

	}

}
