package h.enumDemo;

public class DayTest {

	public static void main(String[] args) {
		
		System.out.println(Day.SUNDAY); // get a reference to anenum instance
		System.out.println(Day.SUNDAY.ordinal()); // get the ordinal
		
		Day[] days = Day.values(); // get all values as array
		for (Day day : days) {
			System.out.println(day);
		}

	}

}
