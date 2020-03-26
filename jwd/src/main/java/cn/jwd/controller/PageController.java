package cn.jwd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
	@RequestMapping("/{page}")
	public String showPage(@PathVariable("page") String page) {
		
		return page;
	}
}
