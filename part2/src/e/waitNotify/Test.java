package e.waitNotify;

public class Test {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		Producer p1 = new Producer("p1", stack, 30, 100);
		Producer p2 = new Producer("p2", stack, 20, 10);
		Producer p3 = new Producer("p3", stack, 50, 70);
		
		Consumer c1 = new Consumer("c1", stack, 20, 250);
		Consumer c2 = new Consumer("c2", stack, 80, 80);
		
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();

	}

}
