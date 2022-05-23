package d.threads;

/**
 * this thread counts from 1 to 1000
 *  */
public class MyThread extends Thread {
	
	
	
	public MyThread(String name) {
		super(name);
	}

	// the run method defines what the thread doing
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(getName() + ": " + i);
		}
	}

}
