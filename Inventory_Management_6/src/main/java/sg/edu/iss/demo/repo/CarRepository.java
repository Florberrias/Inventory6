package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
