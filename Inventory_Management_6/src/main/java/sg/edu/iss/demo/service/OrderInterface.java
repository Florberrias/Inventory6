package sg.edu.iss.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.iss.demo.model.Order;

@Service
public interface OrderInterface {

	public void save(Order order);

	public List<Order> list();

}