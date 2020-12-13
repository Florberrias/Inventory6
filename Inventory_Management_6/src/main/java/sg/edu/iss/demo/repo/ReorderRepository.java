package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.Reorder;

public interface ReorderRepository extends JpaRepository<Reorder, Long> {

}
