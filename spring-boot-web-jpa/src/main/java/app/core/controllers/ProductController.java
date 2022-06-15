package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Product;
import app.core.services.ProductService;
import app.core.utils.JWTUtil;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private JWTUtil jwtUtil;

	@PostMapping("/add")
	public int addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}

	// http://localhost:8080/find?productId=1
	@GetMapping("/find")
	public Product getProduct1(@RequestHeader String token, @RequestParam int productId) {
		try {
			jwtUtil.extractClient(token);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage());
		}
		try {
			return this.productService.getProduct(productId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	// http://localhost:8080/find/1
	@GetMapping("/find/{productId}")
	public Product getProduct2(@PathVariable int productId) {
		try {
			return this.productService.getProduct(productId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/all")
	public List<Product> getAllProducts() {
		try {
			return this.productService.getAllProducts();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PutMapping("/update")
	public void updateProduct(@RequestBody Product product) {
		try {
			this.productService.updateProduct(product);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/delete")
	public void deleteProduct(@RequestParam int productId) {
		try {
			this.productService.deleteProduct(productId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
