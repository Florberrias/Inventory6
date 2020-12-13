package sg.edu.iss.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.demo.model.Product;
import sg.edu.iss.demo.repo.ProductRepository;
import sg.edu.iss.demo.repo.SupplierRepository;

@Service
public class ProductImplementation implements ProductInterface {

	@Autowired
	ProductRepository prepo;
	
	@Autowired
	SupplierRepository srepo;
	
	@Transactional
	public void save(Product product) {
		prepo.save(product);
	}

}
