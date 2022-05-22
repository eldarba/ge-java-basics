package g.collections;

import java.util.Set;
import java.util.TreeSet;

public class Demo5 {

	public static void main(String[] args) {
		
		// TreeSet is sorted
		Set<Person> set = new TreeSet<>(); // natural order (id)
		
		 // other order (age)
//		Set<Person> set = new TreeSet<>(new PersonAgeComparator());
		
		set.add(new Person(103, "aaa", 30));
		set.add(new Person(102, "bbb", 50));
		set.add(new Person(101, "ccc", 25));
		
		System.out.println(set);
		
//		System.out.println(set.get(0));

	}

}
