package sg.edu.iss.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.demo.model.Reorder;
import sg.edu.iss.demo.repo.ReorderRepository;
import sg.edu.iss.demo.repo.SupplierRepository;

@Service
public class ReorderImplementation implements ReorderInterface {

	@Autowired
	ReorderRepository orepo;
	
	@Autowired
	SupplierRepository srepo;
	
	@Transactional
	public void save(Reorder order) {
		orepo.save(order);
	}

	@Override
	public List<Reorder> list() {
		return orepo.findAll();
	}

}
