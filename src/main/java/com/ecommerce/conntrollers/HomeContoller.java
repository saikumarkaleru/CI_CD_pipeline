package com.ecommerce.conntrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
	
	@RequestMapping("/product_list")
	String  product_list() {
		
		return "product_list";
	}
	@RequestMapping("/cart")
	String cart() {
		
		return "cart";
	}
	@RequestMapping("/checkout")
	String checkout() {
		
		return "checkout";
	}
	@RequestMapping("/Catagori")
	String catogiri() {
		
		return "catagori";
	}
	@RequestMapping("/single-product")
	String single_product() {
		
		return "single-product";
	}
	
	@RequestMapping("/confirmation")
	String confirmation() {
		
		return "confirmation";
	}
	@RequestMapping("/elements")
	String elements() {
		
		return "elements";
	}
	@RequestMapping("/single-blog")
	String single_blog() {
		
		return "single-blog";
	}

	@RequestMapping("/contact")
	String contact() {
		
		return "contact";
	}
	@RequestMapping("/industries")
	String industries() {
		
		return "industries";
	}
	@RequestMapping("/login")
	String login() {
		
		
		return "login";
	}
	@RequestMapping("/blog")
	String blog() {
		
		return "blog";
	}
	@RequestMapping("/index")
	String index1() {
		
		return "index";
	}
	@RequestMapping("/about")
	String iabout() {
		
		return "about";
	}
	
}
