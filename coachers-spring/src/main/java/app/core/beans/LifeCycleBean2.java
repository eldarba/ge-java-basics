package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean2 {

	// 3. injections
	@Value("${coach.plan.run}")
	private String plan;

	@PostConstruct
	public void init() {
		System.out.println("---LifeCycleBean is initialized");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("---LifeCycleBean is destroied");

	}

}
