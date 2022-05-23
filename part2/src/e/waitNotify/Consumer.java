package e.waitNotify;

public class Consumer extends Thread {

	private Stack stack;
	private int amount;
	private long rate;

	public Consumer(String name, Stack stack, int amount, long rate) {
		super(name);
		this.stack = stack;
		this.amount = amount;
		this.rate = rate;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int x = stack.pop();
			System.out.println(getName() + " popped " + x);
			try {
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
