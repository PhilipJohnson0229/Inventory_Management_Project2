package com.skillstorm.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.spring.models.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {

}
