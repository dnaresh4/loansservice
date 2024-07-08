package com.cap.repository;

import org.springframework.data.repository.CrudRepository;

import com.cap.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
