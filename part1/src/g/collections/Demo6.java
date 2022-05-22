package g.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo6 {

	public static void main(String[] args) {
		// List is ordered
		List<Person> list = new ArrayList<>();

		list.add(new Person(103, "aaa", 30));
		list.add(new Person(102, "bbb", 50));
		list.add(new Person(101, "ccc", 25));

		System.out.println("insert order");
		print(list);

		System.out.println("sort by natural order (id)");
		list.sort(null);
		print(list);

		System.out.println("sort by other order (age)");
		list.sort(new PersonAgeComparator());
		print(list);
	}

	public static void print(Collection<?> col) {
		// for each loop
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("===================");
	}

}
