package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.AddressEntity;

public interface AddressRepo extends JpaRepository<AddressEntity, Integer>{

}
