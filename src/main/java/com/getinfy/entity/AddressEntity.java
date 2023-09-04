package com.getinfy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="addr_tbl")
public class AddressEntity {
	
	@Id
	private Integer addressId;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipCode;

}
