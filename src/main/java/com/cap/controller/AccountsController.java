package com.cap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cap.domain.Account;
import com.cap.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/accounts")
public class AccountsController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public String showAccountsUI(Account account) {
		return "account";
	}
	
	@PostMapping("/create")
	@ResponseBody
	public Long createAccount(@Valid Account account) {
		log.info("received account creation {}", account);
		return accountService.createAccount(account);
	}
	

}
