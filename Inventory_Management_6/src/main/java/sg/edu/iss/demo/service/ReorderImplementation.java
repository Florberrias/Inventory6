package sg.edu.iss.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.demo.model.Reorder;
import sg.edu.iss.demo.repo.ProductRepository;
import sg.edu.iss.demo.repo.ReorderRepository;
import sg.edu.iss.demo.repo.SupplierRepository;

@Service
public class ReorderImplementation implements ReorderInterface {

	@Autowired
	ReorderRepository rrepo;
	
	@Autowired
	ProductRepository prepo;
	
	@Transactional
	public void save(Reorder reorder) {
		rrepo.save(reorder);
	}

	@Transactional(timeout = 30, readOnly = true)
	public List<Reorder> list() {
		return rrepo.findAll();
	}

}
