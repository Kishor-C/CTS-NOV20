package com.example.restbasedspringbootapp;

import org.springframework.data.jpa.repository.JpaRepository;

// Note: You will not use @Repository, because repository is implemented by springboot

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
