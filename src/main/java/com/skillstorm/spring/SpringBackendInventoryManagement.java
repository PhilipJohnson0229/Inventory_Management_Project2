package com.skillstorm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skillstorm.spring.models.Item;
import com.skillstorm.spring.models.Store;
import com.skillstorm.spring.repositories.ItemRepository;
import com.skillstorm.spring.repositories.StoreRepository;

@SpringBootApplication                                     //tomcat server
public class SpringBackendInventoryManagement implements CommandLineRunner {

	public static void main(String[] args) {
		// Application Context
		SpringApplication.run(SpringBackendInventoryManagement.class, args);
	}

	@Autowired
	ItemRepository repo;
	
	@Autowired
	StoreRepository storeRepo;

	
	@Override
	public void run(String... args) throws Exception {
		storeRepo.save(new Store("Targe'","123 Somewhere Rd. Jacksonville FL 12345"));
		storeRepo.save(new Store("CBS","123 Somewhere Rd. Jacksonville FL 12345"));
		storeRepo.save(new Store("Warmart","123 Somewhere Rd. Jacksonville FL 12345"));
		
		repo.save(new Item("Pokemon Cards Deck", "60.00", "Targe", "Toys"));
		repo.save(new Item("Spam", "10.00", "CBS", "Food"));
		repo.save(new Item("Candles", "20.00", "Targe", "Decor"));
		repo.save(new Item("Swiss Cheese", "30.00", "Warmart", "Food"));
	}

}
