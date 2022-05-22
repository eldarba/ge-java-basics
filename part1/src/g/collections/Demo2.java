package g.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		// HashSet is NOT ordered
		Set<String> set = new HashSet<>();
		set.add("Math");
		set.add("Math");
		set.add("English");
		set.add("English");
		set.add("Java");
		
		System.out.println(set);
		
//		System.out.println(set.get(0));

	}

}
