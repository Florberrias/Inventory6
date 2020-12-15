package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Consumption;

public interface ConsumptionRepository extends JpaRepository<Consumption, Integer> {

}