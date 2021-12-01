package com.abc.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.bankapp.entity.Account;
import com.abc.bankapp.service.AccountService;

@RestController
public class AccountController {
      
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/save")
	public Account saveAccount(@RequestBody Account account) {
		
		Account newAccount = accountService.saveAccount(account);
	    
		return newAccount;
	
	}
	
	    
          
	@GetMapping("/getall")
	public List<Account> fetchAllAccounts(){

	List<Account> accounts= accountService.getAllAccounts();
		return accounts;
		
		
	}
	
	@GetMapping("/get/{id}")
	public Account getAccountDeatils(@PathVariable("id")int accno) {
		Account account=accountService.getAccountByAccno(accno);
		return account;
	}
}
