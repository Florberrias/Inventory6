package sg.edu.iss.demo.service;

import org.springframework.stereotype.Service;

import sg.edu.iss.demo.model.Product;

@Service
public interface ProductInterface {

	public void save(Product product);

}