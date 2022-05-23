package d.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// get a reference to the current thread
		Thread curr = Thread.currentThread();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(curr.getName() + ": " + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// what the thread does when interrupted
				System.out.println(curr.getName() + " interrupted and will stop");
				return;
			}
		}
	}

}
