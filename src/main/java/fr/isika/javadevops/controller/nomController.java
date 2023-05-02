package fr.isika.javadevops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.javadevops.model.Person;

@Controller
@RequestMapping("/")
public class nomController  {
	
	@GetMapping("/")
	public String name(Model model) throws Exception {	
		Person person = new Person();
		model.addAttribute("person", person);
		return "index";
	}
	
	
	@PostMapping("/returnName")
	public String returnName(@RequestParam("name") String name, Model model) {
		
//		message = "Bonjour " + name + " ... Vous êtes bien matinal ...";
		Person person = new Person();
		person.setName(name);
		model.addAttribute("person", person);
		System.out.println(name);
		return "index";
    }
	
//	@PostMapping("/post")
//	public String post(@RequestParam("p1") String p1,Model model)
//	{
//		model.addAttribute("P1",p1);
//
//		return "page1";
//	}
}
