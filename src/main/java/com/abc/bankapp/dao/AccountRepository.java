package com.abc.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.bankapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
