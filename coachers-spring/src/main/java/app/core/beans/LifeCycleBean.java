package app.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean {

	// 1 - only once
	static {
		System.out.println("0. LifeCycleBean class loaded");
	}

	// on object creation
	{ // 1. initializer
		System.out.println("1. LifeCycleBean initializer");
	}

	// 2. CTOR
	public LifeCycleBean() {
		System.out.println("2. LifeCycleBean CTOR");
	}

	// 3. injections
	@Value("${coach.plan.run}")
	private String plan;

	// life cycle hook - create
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LifeCycleBean is initialized");
	}

	// life cycle hook - destroy
	@Override
	public void destroy() throws Exception {
		System.out.println("LifeCycleBean is destroied");

	}

}
