package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.utils.JWTUtil;
import app.core.utils.JWTUtil.Client;
import app.core.utils.JWTUtil.Client.ClientType;

@RestController
public class LoginController {

	@Autowired
	private JWTUtil jwtUtil;

	@PutMapping("/login")
	public String login(String email, String password) {
		Client client = new Client(email, ClientType.ADMIN, 101);
		return jwtUtil.generateToken(client);
	}

}
