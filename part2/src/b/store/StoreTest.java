package b.store;

public class StoreTest {

	public static void main(String[] args) {
		
		Store store = new Store();
		try {
			store.addItem(new Item(101, "eggs", 15.30));
			store.addItem(new Item(102, "bread", 12.70));
			store.addItem(new Item(103, "chease", 20.30));
			store.addItem(new Item(104, "TV", 100.30));
			store.addItem(new Item(105, "car", 25000.30));
//			store.addItem(new Item(106, "toy", 12.30));
			store.displayItems();
		} catch (StoreException e) {
			// e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println();
		}
		

	}

}
