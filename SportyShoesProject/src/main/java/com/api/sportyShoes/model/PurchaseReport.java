package com.api.sportyShoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class PurchaseReport {
	
	

	public PurchaseReport(int id, String purchasedBy, String category, Date dop, String orderList) {
		super();
		this.id = id;
		this.setPurchasedBy(purchasedBy);
		this.setCategory(category);
		this.dop = dop;
		this.orderList = orderList;
	}

	public String getPurchasedBy() {
		return purchasedBy;
	}

	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Id
	@GeneratedValue
	private int id;
	private String purchasedBy; 
	private String category;
	
	@Temporal(TemporalType.DATE)
	private Date dop;
	

	String orderList;

public int getId() {
	// TODO Auto-generated method stub
	return 0;
}
	
}
