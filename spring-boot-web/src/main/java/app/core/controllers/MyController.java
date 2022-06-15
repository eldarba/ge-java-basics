package app.core.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(method = RequestMethod.GET, path = "/greet")
	public String greet() {
		return "Hello from controller";
	}

	@GetMapping("/num")
	public int luckyNumber() {
		return (int) (Math.random() * 101);
	}

	@GetMapping(path = "/num2", produces = MediaType.APPLICATION_JSON_VALUE)
	public String luckyNumber2() {
		String json = "{\"val\":" + (int) (Math.random() * 101) + "}";
		return json;
	}

}
