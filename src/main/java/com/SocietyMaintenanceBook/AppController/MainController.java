package com.SocietyMaintenanceBook.AppController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public String loadPage() {
		System.out.println("Hello");
		return "index";
	}
}
