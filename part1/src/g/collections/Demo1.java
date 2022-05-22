package g.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("English");
		list.add("English");
		list.add("Math");
		list.add("Java");
		list.add("Math");
		
		System.out.println(list);
		
		System.out.println(list.get(0));

	}

}
