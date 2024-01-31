package com.springprofessional.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprofessional.aula.entities.Order;

@Service
public class ShippingService {
	
	@Autowired
	private OrderService orderService;
		
	public Double shipment(Order order) {
		if(order.getBasic() < 100.0) {
			return this.orderService.total(order) + 20.0;
		}else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
			return this.orderService.total(order) + 12.0;
		}
		
		return this.orderService.total(order);
	}

}
