package com.company.app.controller;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.app.model.Deal;
import com.company.app.service.DealService;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/Deal")
@RestController
public class DealController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DealService service;
	
	@GetMapping("/getall")
	@ResponseBody
	public List<Deal> getDeal(){
		log.info("controller get all Deal method");
		return service.getAllDeal();
	}

	@GetMapping("/getbyid/{id}")
	@ApiOperation(value = "Get Deal by ID api")
	@ResponseBody
	public Optional<Deal> getDealById(@PathVariable int id) {
		log.info("controller find by Id method");
		return service.getDealById(id);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@PostMapping("/create")
	@ApiOperation(value = "Post Deal api")
	@ResponseBody
	public Deal addDeal(@RequestBody Deal Deal) {
		log.info("controller create Deal");
		return service.addDeal(Deal);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "Delete Deal by ID api")
	@ResponseBody
	public Map<String, String> deleteDealById(@PathVariable int id) {
		log.info("controller find all method");
		service.deleteDealById(id);
		HashMap<String,String> res = new HashMap<String, String>();
        res.put("message","done");
		return  res;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@PutMapping("/update/{id}")
	@ApiOperation(value = "Update Deal api")
	@ResponseBody
	public Deal updateDeal(@RequestBody Deal Deal,@PathVariable int id){
		log.info("controller update Deal method");
		return service.updateDeal(Deal,id);
	}

}
