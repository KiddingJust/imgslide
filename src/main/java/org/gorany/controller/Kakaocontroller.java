package org.gorany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.extern.java.Log;

@Controller
@Log
public class Kakaocontroller {
	
	@GetMapping("/data")
	public void list() {
		log.info("로긴 데이타 겟페이지임다~~~~");
	}
	
	@GetMapping("/sample1")
	public void sample1() {
		log.info("샘플 데이타 겟페이지임다~~~~");
	}

}
