package com.walmart.treasury.ExchangeRate.repository;

import org.springframework.data.repository.CrudRepository;
import com.walmart.treasury.ExchangeRate.model.User;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

}