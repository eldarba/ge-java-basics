package e.waitNotify;

public class Producer extends Thread {

	private Stack stack;
	private int amount;
	private long rate;

	public Producer(String name, Stack stack, int amount, long rate) {
		super(name);
		this.stack = stack;
		this.amount = amount;
		this.rate = rate;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int x = (int) (Math.random() * 101);
			stack.push(x);
			System.out.println(getName() + " pushed " + x);
			try {
				Thread.sleep(rate);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
