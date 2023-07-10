package com.main.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.cjc.model.Student;
import com.main.cjc.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/savedata")
	public Student savedata(@RequestBody Student s) {
		return hs.savedata(s);
	}
	

}
