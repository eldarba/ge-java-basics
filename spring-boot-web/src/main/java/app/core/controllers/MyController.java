package app.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
public class MyController {

	@RequestMapping(method = RequestMethod.GET, path = "/greet")
	public String greet() {
		return "Hello from controller";
	}

	@GetMapping("/num")
	public int luckyNumber() {
		if (Math.random() < 0.5) {
			return (int) (Math.random() * 101);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "error: luckyNumber failed");
		}
	}

	@GetMapping(path = "/num2", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE })
	public String luckyNumber2() {
		String json = "{\"val\":" + (int) (Math.random() * 101) + "}";
		return json;
	}

}
