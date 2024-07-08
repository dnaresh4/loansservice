package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.domain.Account;
import com.cap.repository.AccountRepository;

@Service 
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	public Long createAccount(Account account) {
		return accountRepository.save(account).getAccountId();
	}

}
