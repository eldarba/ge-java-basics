package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Product;
import app.core.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public int addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}

}
