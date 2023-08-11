package com.BasicProject.NameDataGenerator;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class NameGeneratorController {
	
	private final NameGeneratorService nameGeneratorService;

    @Autowired
    public NameGeneratorController(NameGeneratorService nameGeneratorService) {
        this.nameGeneratorService = nameGeneratorService;
    }
    
    @GetMapping("/") // Map root URL to show the UI form
    public ModelAndView showForm() {
        //return "name-generator"; // Return the Thymeleaf template name
//    	return "<!DOCTYPE html>\n" +
//        "<html>\n" +
//        "<head>\n" +
//        "    <title>Simple Heading</title>\n" +
//        "</head>\n" +
//        "<body>\n" +
//        "    <h1>Hello, Spring Boot!</h1>\n" +
//        "</body>\n" +
//        "</html>";
    	ModelAndView modelAndView = new ModelAndView("name-generator");
        modelAndView.addObject("names", "Generated Names will be shown here!!");
        return modelAndView;
    
    }
    
    @GetMapping("/generate")
    public List<String> generateName(@RequestParam int num) {
        //return nameGeneratorService.generateRandomName();
    	return generating_multiple_records(num);
        
    }    
    
    public List<String> generating_multiple_records(int num){
    	List<String> names = new ArrayList<String>();
    	for(int i=0;i<num;i++) {
    		names.add(nameGeneratorService.generateRandomName());
    	}
    	return names;
    }
}




	
	


