package com.kutay.springboot.apiControlllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")
public class StatusRestService {
	
	@GetMapping(value="/stat")
	public String status(){
		return "OK";
	}

}
