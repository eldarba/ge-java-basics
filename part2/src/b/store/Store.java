package b.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private List<Item> items = new ArrayList<>();
	public static final int MAX = 5;
	
	public void addItem(Item item) throws Exception {
		if(items.size() < 5) {
			items.add(item);
		}else {
			throw new StoreException("addItem failed - too many items. max is " + MAX);
		}
	}
	
	public void displayItems() {
		System.out.println("=== List of Strore Items ===");
		for (Item item : items) {
			System.out.println(item);
		}
		System.out.println("=== ==================== ===");
	}
	
	

}
