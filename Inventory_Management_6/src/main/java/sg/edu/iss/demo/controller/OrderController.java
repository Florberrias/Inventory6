package sg.edu.iss.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.edu.iss.demo.model.Reorder;
import sg.edu.iss.demo.service.ReorderImplementation;
import sg.edu.iss.demo.service.ReorderInterface;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private ReorderInterface oservice;
	
	@Autowired
	public void setOrderImplementation(ReorderImplementation oimpl) {
		this.oservice = oimpl;
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		List<Reorder> olist = oservice.list();
		model.addAttribute("olist", olist);
		return "order";
	}
	
	@RequestMapping(value = "/entryform", method = RequestMethod.GET)
	public String showEntryForm(Model model) {
		return "order";
	}
	
	@RequestMapping(value = "/reorderform", method = RequestMethod.GET)
	public String showReorderForm(Model model) {
		return "order";
	}
	
	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public String showReport(Model model) {
		return "order";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String viewOrder(Model model) {
		return "order";
	}


}