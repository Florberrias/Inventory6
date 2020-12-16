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
@RequestMapping("/reorder")
public class ReorderController {
	
	@Autowired
	private ReorderInterface rservice;
	
	@Autowired
	public void setReorderImplementation(ReorderImplementation rimpl) {
		this.rservice = rimpl;
	}
	
	// User requests to view the list of orders made
	@RequestMapping(value = "/list")
	public String list(Model model) {
		List<Reorder> rlist = rservice.list();
		model.addAttribute("rlist", rlist);
		return "reorder";
	}
	
	// User requests to view order details of a specific order made
	@RequestMapping(value = "/reorderreport", method = RequestMethod.GET)
	public String reorderReport(Model model) {
		Reorder reorder = new Reorder();
		model.addAttribute("reorder", reorder);
		return "reorderreport";
	}
	
	// User requests to view order details of a specific order made
		@RequestMapping(value = "/reorderform", method = RequestMethod.GET)
		public String reorderForm(Model model) {
			Reorder reorder = new Reorder();
			model.addAttribute("reorder", reorder);
			return "reorderform";
		}
		
	// User requests to view order details of a specific order made
	@RequestMapping(value = "/vieworder", method = RequestMethod.GET)
	public String viewOrder(Model model) {
		Reorder reorder = new Reorder();
		model.addAttribute("reorder", reorder);
		return "orderview";
	}
	
	// User requests to view stock entered after the previous order was added to inventory
	@RequestMapping(value = "/seformview", method = RequestMethod.GET)
	public String viewSEForm(Model model) {
		Reorder reorder = new Reorder();
		model.addAttribute("reorder", reorder);
		return "stockentryview";
	}
	
	// User requests to edit the stock upon receiving order
	@RequestMapping(value = "/seformedit", method = RequestMethod.GET)
	public String editSEForm(Model model) {
		Reorder reorder = new Reorder();
		model.addAttribute("reorder", reorder);
		return "editstockentry";
	}
}