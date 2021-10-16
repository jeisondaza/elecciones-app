package sprint1.sprint1.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import sprint1.sprint1.entities.Persons;
import sprint1.sprint1.services.RegService;

@Controller
public class Controler {

    @Autowired
    private RegService regService;
    
    @GetMapping("/votapp")
    public String deploy() {
        return "/info/index";
    }

    @GetMapping("/votar")
    public String votar() {
        return "/forms/votar";
    }
    @GetMapping("/result")
    public String result() {
        return "/info/result";
    }

    @GetMapping("/regForm")
    public String singUp(Model model) {
        model.addAttribute("formulario", new Persons());
        return "/forms/person";
    }

    @PostMapping("/singUp")
    public String singUp(@Validated Persons person) {
    	System.out.println(person.toString());
        regService.save(person);
        return "redirect:/votapp";
    }
    
    @GetMapping("/consultar/{id}")
	 public String consultar(@PathVariable int id, Model model){
        try {
			Optional<Persons> person = regService.findById(id);
		    model.addAttribute("data", person.get());
		} 
        catch (Exception e) {
            System.out.println("Error: " + e.getCause());
            return "info/404";
		}
        //System.out.println(person.toString());
        return "/info/datos";
	}

    @GetMapping("/consultar/regForm")
    public String irForm() {
        return "redirect:/regForm";
    }
    @GetMapping("/consultar/votapp")
    public String irHome() {
        return "redirect:/votapp";
    }

}

