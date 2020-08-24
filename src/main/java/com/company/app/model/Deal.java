package com.company.app.model;

import java.util.*;

import javax.persistence.*;


@Entity
public class Deal {

	@Id
	private int dealId;

	public int getDealid(){
		return dealId;
	}

	public void setDealid(int dealId){
		this.dealId = dealId;
	}


	private String dealNumber;

	public String getDealnumber(){
		return dealNumber;
	}

	public void setDealnumber(String dealNumber){
		this.dealNumber = dealNumber;
	}


	private Date dealDate;

	public Date getDealdate(){
		return dealDate;
	}

	public void setDealdate(Date dealDate){
		this.dealDate = dealDate;
	}


	private String status;

	public String getStatus(){
		return status;
	}

	public void setStatus(String status){
		this.status = status;
	}


	private String preferredRemittance;

	public String getPreferredremittance(){
		return preferredRemittance;
	}

	public void setPreferredremittance(String preferredRemittance){
		this.preferredRemittance = preferredRemittance;
	}


	private String borrowerCustomerId;

	public String getBorrowercustomerid(){
		return borrowerCustomerId;
	}

	public void setBorrowercustomerid(String borrowerCustomerId){
		this.borrowerCustomerId = borrowerCustomerId;
	}



	public Deal() {  }

	public Deal(
		int dealId,
		String dealNumber,
		Date dealDate,
		String status,
		String preferredRemittance,
		String borrowerCustomerId
	) {
		this.dealId = dealId;
		this.dealNumber = dealNumber;
		this.dealDate = dealDate;
		this.status = status;
		this.preferredRemittance = preferredRemittance;
		this.borrowerCustomerId = borrowerCustomerId;
	}

	@OneToMany(targetEntity = Facility.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="Deal_fk",referencedColumnName = "dealId")
	private List<Facility> Facility;
}
