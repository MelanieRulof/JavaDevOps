package fr.isika.javadevops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class nomController {
	
	public String message;
	
	@GetMapping("/returnName")
	public String name() {
		message = "rentrez votre name";
		return "redirect:/index";
	}
	
	
	@PostMapping("/returnName")
	public String returnName(@RequestBody String name, Model model) {
		message = "Bonjour " + name + " ... Vous êtes bien matinal ...";
		model.addAttribute("name", name);
		System.out.println(name);
		return "index";
    }
	
	@PostMapping("/post")
	public String post(@RequestParam("p1") String p1,Model model)
	{
		model.addAttribute("P1",p1);

		return "page1";
	}
}
