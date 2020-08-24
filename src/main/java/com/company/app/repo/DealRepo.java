package com.company.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.app.model.Deal;

public interface DealRepo extends JpaRepository<Deal, Integer>{

}
