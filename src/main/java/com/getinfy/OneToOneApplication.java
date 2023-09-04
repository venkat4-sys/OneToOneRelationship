package com.getinfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.getinfy.entity.AddressEntity;
import com.getinfy.entity.OrderEntity;
import com.getinfy.repo.OrderRepo;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneApplication.class, args);
		
		OrderRepo orderRepo = context.getBean(OrderRepo.class);
		
		
		OrderEntity entity=new OrderEntity();
		entity.setOrderId(1);
		entity.setOrderPrice(240);
		entity.setOrderQuantity(4);
		entity.setOrderStatus("Delevered");
		
		AddressEntity aentity=new AddressEntity();
		aentity.setAddressId(1);
		aentity.setCity("Guntur");
		aentity.setCountry("India");
		aentity.setState("AP");
		aentity.setZipCode("AXB2348");
		
		
		entity.setAddress(aentity);
		
		orderRepo.save(entity);
	}

}
