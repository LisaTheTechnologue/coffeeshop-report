package com.company.coffeeshopreport.dao;

import com.company.coffeeshopreport.model.Item;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends ListCrudRepository<Item, Long> {
    //...
}