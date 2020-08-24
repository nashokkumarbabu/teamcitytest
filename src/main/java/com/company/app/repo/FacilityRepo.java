package com.company.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.app.model.Facility;

public interface FacilityRepo extends JpaRepository<Facility, Integer>{

}
