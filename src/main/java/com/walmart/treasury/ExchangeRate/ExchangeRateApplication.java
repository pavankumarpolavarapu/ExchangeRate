package com.walmart.treasury.ExchangeRate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


import com.walmart.treasury.ExchangeRate.model.User;
import com.walmart.treasury.ExchangeRate.repository.UserRepository;



@SpringBootApplication
public class ExchangeRateApplication {

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ExchangeRateApplication.class, args);
	}
    @Override
    public void run(String... args) {


        repository.save(new User("Java"));
        repository.save(new User("Node"));
        repository.save(new User("Python"));

        System.out.println("\nfindAll()");
        repository.findAll().forEach(x -> System.out.println(x));

        System.out.println("\nfindById(1L)");
        repository.findById(1l).ifPresent(x -> System.out.println(x));

        System.out.println("\nfindByName('Node')");
        repository.findByName("Node").forEach(x -> System.out.println(x));

	}
	
}
