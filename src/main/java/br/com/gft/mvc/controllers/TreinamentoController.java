package br.com.gft.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.gft.mvc.entities.Person;
import br.com.gft.mvc.services.PersonService;

@Controller
public class TreinamentoController {

	@RequestMapping(method = RequestMethod.GET, path = "/index")
	public ModelAndView index(@RequestParam(name = "name") String firstName, @RequestParam Integer age) {

		ModelAndView mv = new ModelAndView("index.html");
		mv.addObject("name", firstName);

		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/about")
	public ModelAndView about() {

		System.out.println("Agora estou aqui no about");

		return new ModelAndView("about.html");
	}
	
	@RequestMapping(method = RequestMethod.GET, path ="/person")
	public ModelAndView getPerson() {

		PersonService personService = new PersonService();
		ModelAndView mv = new ModelAndView("Person.html");
		
		Person person = personService.createPerson();

		mv.addObject("person", person);

		return mv;

	}

}
