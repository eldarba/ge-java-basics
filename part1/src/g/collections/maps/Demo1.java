package g.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', 65);
		map.put('B', 66);
		map.put('C', 67);
		System.out.println(map);
		
		// get a value from key
		System.out.println(map.get('A'));
		
		Set<Character> keys = map.keySet();
		for (Character c : keys) {
			System.out.println(c + " - " + map.get(c));
		}
	}

}
