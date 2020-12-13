package sg.edu.iss.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.demo.model.Order;
import sg.edu.iss.demo.repo.OrderRepository;
import sg.edu.iss.demo.repo.SupplierRepository;

@Service
public class OrderImplementation implements OrderInterface {

	@Autowired
	OrderRepository orepo;
	
	@Autowired
	SupplierRepository srepo;
	
	@Transactional
	public void save(Order order) {
		orepo.save(order);
	}

	@Override
	public List<Order> list() {
		return orepo.findAll();
	}

}
