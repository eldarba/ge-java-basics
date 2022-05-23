package d.threads;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// technique 2
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r, "t");
		System.out.println("state: " + t.getState()); // NEW
		t.start();
		System.out.println("state: " + t.getState()); // RUNNABLE
		Thread.sleep(500);
		System.out.println("state: " + t.getState()); // TIMED_WAITING
		t.join(); // main (current thread) waits for t to die
		System.out.println("state: " + t.getState()); // TERMINATED
		
		

	}

}
