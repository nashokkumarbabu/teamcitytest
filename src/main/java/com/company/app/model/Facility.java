package com.company.app.model;

import java.util.*;

import javax.persistence.*;


@Entity
public class Facility {

	@Id
	private int id;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}


	private int dealId;

	public int getDealid(){
		return dealId;
	}

	public void setDealid(int dealId){
		this.dealId = dealId;
	}


	private String facilityName;

	public String getFacilityname(){
		return facilityName;
	}

	public void setFacilityname(String facilityName){
		this.facilityName = facilityName;
	}


	private Date facilityMaturityDate;

	public Date getFacilitymaturitydate(){
		return facilityMaturityDate;
	}

	public void setFacilitymaturitydate(Date facilityMaturityDate){
		this.facilityMaturityDate = facilityMaturityDate;
	}


	private Date facilityEffectiveDate;

	public Date getFacilityeffectivedate(){
		return facilityEffectiveDate;
	}

	public void setFacilityeffectivedate(Date facilityEffectiveDate){
		this.facilityEffectiveDate = facilityEffectiveDate;
	}



	public Facility() {  }

	public Facility(
		int id,
		int dealId,
		String facilityName,
		Date facilityMaturityDate,
		Date facilityEffectiveDate
	) {
		this.id = id;
		this.dealId = dealId;
		this.facilityName = facilityName;
		this.facilityMaturityDate = facilityMaturityDate;
		this.facilityEffectiveDate = facilityEffectiveDate;
	}


}
