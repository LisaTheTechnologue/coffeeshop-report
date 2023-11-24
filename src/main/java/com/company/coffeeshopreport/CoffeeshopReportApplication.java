package com.company.coffeeshopreport;

import com.company.coffeeshopreport.dao.ItemRepository;
import com.company.coffeeshopreport.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeeshopReportApplication implements CommandLineRunner {

	@Autowired
	ItemRepository itemRepository;

	// run this in address bar http://localhost:8080/item-report/pdf
	// how to do: https://howtodoinjava.com/spring-boot/spring-boot-jasper-report/
	public static void main(String[] args) {
		SpringApplication.run(CoffeeshopReportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		itemRepository.save(new Item("Item 1"));
		itemRepository.save(new Item("Item 2"));
		itemRepository.save(new Item("Item 3"));
		itemRepository.save(new Item("Item 4"));
		itemRepository.save(new Item("Item 5"));
	}
}
