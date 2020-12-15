package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
