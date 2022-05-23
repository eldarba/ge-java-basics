package d.threads;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r, "t");
		t.start();
		
		Thread.sleep(3200);
		t.interrupt();
		

	}

}
