package sg.edu.iss.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.edu.iss.demo.model.Product;
import sg.edu.iss.demo.service.ProductImplementation;
import sg.edu.iss.demo.service.ProductInterface;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductInterface pservice;
	
	@Autowired
	public void setCatalogueImplementation(ProductImplementation pimpl) {
		this.pservice = pimpl;
	}
	
	@RequestMapping(value = "/stockentryform", method = RequestMethod.GET)
	public String showForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("product") Product product, BindingResult bindingResult, Model model) {
		pservice.save(product);
		return "forward:/product/list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		List<Product> plist = pservice.list();
		model.addAttribute("plist", plist);
		return "product";
	}

}