package com.getinfy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_tbl")
public class OrderEntity {
	
	@Id
	private Integer orderId;
	
	private Integer orderQuantity;
	
	private Integer orderPrice;
	
	private String orderStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private AddressEntity address;

}
