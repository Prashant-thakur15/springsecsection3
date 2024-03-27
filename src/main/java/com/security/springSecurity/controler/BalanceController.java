package com.security.springSecurity.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	@GetMapping("/balance")
	public String getCard() {
		return "balance from Db";
	}
}
