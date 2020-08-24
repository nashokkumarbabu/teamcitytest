package com.company.app.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.company.app.model.Deal;
import com.company.app.repo.DealRepo;

@Service
public class DealService {
	
	@Autowired
	private DealRepo repo;
	
	public List<Deal> getAllDeal(){
		return repo.findAll();
	}

	public Optional<Deal> getDealById(int id) {
		return repo.findById(id);
	}

	public Deal addDeal(Deal Deal) {
		System.out.println("in service");
		return repo.save(Deal);
	}

	public void deleteDealById(int id) {
		try{
			repo.deleteById(id);
		} catch(Exception e){
			
		}
	}

	public Deal updateDeal(Deal Deal,int id){
		Deal o = repo.findById(id).orElse(new Deal());
			
			o.setDealid(Deal.getDealid());
			
			o.setDealnumber(Deal.getDealnumber());
			
			o.setDealdate(Deal.getDealdate());
			
			o.setStatus(Deal.getStatus());
			
			o.setPreferredremittance(Deal.getPreferredremittance());
			
			o.setBorrowercustomerid(Deal.getBorrowercustomerid());
		
		return repo.save(o);
	}

}
