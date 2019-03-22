package com.project.dao;

import org.springframework.stereotype.Component;

import com.project.model.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void creation(Customer customer) {
		// TODO Auto-generated method stub
		
		System.out.println(" db validation");

	}

}
