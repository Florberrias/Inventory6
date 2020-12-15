package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{

}
