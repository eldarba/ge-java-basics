package app.core.beans;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job2 {

	@Scheduled(initialDelay = 1000, fixedRate = 5000)
	public void theJob() {
		System.out.println("--------- system is up");
	}

}
