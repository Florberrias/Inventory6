package sg.edu.iss.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
