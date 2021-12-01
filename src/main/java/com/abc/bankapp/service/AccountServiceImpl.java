package com.abc.bankapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.bankapp.dao.AccountRepository;
import com.abc.bankapp.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
   private  AccountRepository accountRepository;
	
	@Override
	public  Account saveAccount(Account account) {
		Account account1=accountRepository.save(account);
		return account1;
	}

	@Override
	public Account getAccountByAccno(int accno) {
		Optional<Account> optionalAccount = accountRepository.findById(accno);
		return optionalAccount.get();
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		return accounts;
	}

}
