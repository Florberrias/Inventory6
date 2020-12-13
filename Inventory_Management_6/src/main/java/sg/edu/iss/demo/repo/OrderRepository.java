package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
