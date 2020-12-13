package sg.edu.iss.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.iss.demo.model.Reorder;

@Service
public interface ReorderInterface {

	public void save(Reorder order);

	public List<Reorder> list();

}