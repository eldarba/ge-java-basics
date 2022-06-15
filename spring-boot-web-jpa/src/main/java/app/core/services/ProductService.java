package app.core.services;

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

}
