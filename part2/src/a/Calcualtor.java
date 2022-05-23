package a;

public class Calcualtor {

	public int div(int a, int b) throws Exception {
		if (b != 0) {
			return a / b;
		} else {
			throw new Exception("divide by zero");
		}
	}

	

}
