package app.core.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Product;
import app.core.exceptions.ProductSystemException;
import app.core.repos.ProductRepo;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public int addProduct(Product product) {
		if (product.getPrice() >= 0) {
			this.productRepo.save(product);
			return product.getId();
		} else {
			throw new ProductSystemException("addProduct failed - price cannot be negative");
		}
	}

	public Product getProduct(int productId) {
		var opt = this.productRepo.findById(productId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new ProductSystemException("getProduct failed - not found");
		}
	}

	public List<Product> getAllProducts() {
		return this.productRepo.findAll();
	}

}
