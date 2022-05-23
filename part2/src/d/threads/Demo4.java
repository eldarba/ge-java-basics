package d.threads;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		

		MyThread t = new MyThread("t");
		t.start();
		
		Thread.sleep(5);
		t.interrupt();
		

	}

}
