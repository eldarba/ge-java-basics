package e.waitNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> list = new ArrayList<>();
	public static final int MAX = 10;

	public synchronized void push(int val) {
		while (list.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(val);
		System.out.println(list);
		notify();
	}

	public synchronized int pop() {
		while (list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int x = list.remove(list.size() - 1);
		notify();
		System.out.println(list);
		return x;
	}

}
