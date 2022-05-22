package g.collections;

import java.util.Set;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		
		// LinkedHashSet is ordered
		Set<String> set = new TreeSet<>();
		set.add("Math");
		set.add("Java");
		set.add("English");
		
		System.out.println(set);
		
//		System.out.println(set.get(0));

	}

}
