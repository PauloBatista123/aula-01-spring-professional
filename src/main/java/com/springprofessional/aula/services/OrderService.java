package com.springprofessional.aula.services;

import org.springframework.stereotype.Service;

import com.springprofessional.aula.entities.Order;

@Service
public class OrderService {
	
	public Double total(Order order) {
		return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));		
	}
}
