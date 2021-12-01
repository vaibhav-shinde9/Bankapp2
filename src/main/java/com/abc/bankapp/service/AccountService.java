package com.abc.bankapp.service;

import java.util.List;

import com.abc.bankapp.entity.Account;

public interface AccountService {
	
	
	public Account saveAccount(Account account) ;
		
	public  Account getAccountByAccno(int accno);
	
	public  List<Account> getAllAccounts();
	
	}

 
