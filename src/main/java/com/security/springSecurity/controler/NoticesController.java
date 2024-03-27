package com.security.springSecurity.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	@GetMapping("/notice")
	public String getNotice() {
		return "notice from DB";
	}
	
}
