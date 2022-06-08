package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Job {

	private Thread job;

	@PostConstruct
	public void init() {
		job = new Thread(() -> {
			while (true) {
				System.out.println("system is up");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("job terminated");
					break;
				}
			}
		});
		job.start();
	}

	@PreDestroy
	public void destroy() {
		job.interrupt();
	}

}
