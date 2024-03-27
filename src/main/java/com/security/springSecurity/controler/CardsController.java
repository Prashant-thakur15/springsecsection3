package com.security.springSecurity.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	@GetMapping("/cards")
	public String getCard() {
		return "card from Db";
	}
}
