package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
