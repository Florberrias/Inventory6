package sg.edu.iss.demo;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sg.edu.iss.demo.model.OrderStatus;
import sg.edu.iss.demo.model.Product;
import sg.edu.iss.demo.model.Reorder;
import sg.edu.iss.demo.repo.ProductRepository;
import sg.edu.iss.demo.repo.ReorderRepository;
import sg.edu.iss.demo.repo.SupplierRepository;

@SpringBootTest
class InventoryManagement6ApplicationTests {

	@Autowired
	private ReorderRepository orepo;
	
	@Autowired
	private ProductRepository prepo;
	
	@Autowired
	private SupplierRepository srepo;
	
	@Test
	void contextLoads() {
		Product p1 = new Product("royal maxpider car mat", "toyota comfortable car mat", "car mat", "comfort", 100, 150, 130, 110, 1, "leg", s1);
		prepo.save(p1);
		Supplier s1 = new Supplier(11, "toyota", "toyota", "ali", 98765432, "7 Toa Payoh Industrial Park, Singapore 319059", "alimani@gmail.com", p1);
		srepo.save(s1);
		Reorder o1 = new Reorder(p1, "car mat", 100, OrderStatus.NOTORDERED, 2020-12-11, 1, s1);
		orepo.save(o1);
	}
}
