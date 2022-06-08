package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TurboEngine implements Engine {

	@Override
	public void start() {
		System.out.println("turbo engine started");
	}

	@Override
	public void stop() {
		System.out.println("turbo engine stoped");
	}

}
