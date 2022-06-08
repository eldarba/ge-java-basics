package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope("prototype")
public class StandardEngine implements Engine {

	@Override
	public void start() {
		System.out.println("engine started");
	}

	@Override
	public void stop() {
		System.out.println("engine stoped");
	}

}
