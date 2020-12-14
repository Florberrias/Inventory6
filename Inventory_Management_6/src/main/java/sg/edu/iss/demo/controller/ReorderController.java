package sg.edu.iss.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("reorder") Reorder reorder, BindingResult bindingResult, Model model) {
		rservice.save(reorder);
		return "forward:/reorder/list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		List<Reorder> rlist = rservice.list();
		model.addAttribute("rlist", rlist);
		return "reorder";
	}
	
}