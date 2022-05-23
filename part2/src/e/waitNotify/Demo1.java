package e.waitNotify;

public class Demo1 {

	public static void main(String[] args) {
		Object obj = new Object();
		try {
			// to acquire the monitor use synchronized
			synchronized (obj) {
				obj.wait();
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
