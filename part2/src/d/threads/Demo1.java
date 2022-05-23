package d.threads;

public class Demo1 {

	public static void main(String[] args) {
		
		// a thread is an object of class java.lang.Thread
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		// technique 1
		MyThread t1 = new MyThread("t1");
		t1.start();

		MyThread t2 = new MyThread("t2");
		t2.start();
		
		// technique 2
		MyRunnable r = new MyRunnable();
		Thread t3 = new Thread(r, "t3");
		Thread t4 = new Thread(r, "t4");
		t3.start();
		t4.start();
		

	}

}
