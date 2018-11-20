package org.gorany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {

	@GetMapping("/slide")
	public void list() {
		log.info("slide");
	}
	
	@GetMapping("/slide2")
	public void list2() {
	}
	
	@GetMapping("/map")
	public void map() {
		
	}
	
}
