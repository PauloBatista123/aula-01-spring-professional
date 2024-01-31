package com.springprofessional.aula;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springprofessional.aula.entities.Order;
import com.springprofessional.aula.services.OrderService;
import com.springprofessional.aula.services.ShippingService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner{
	
	@Autowired
	private ShippingService service;

	public static void main(String[] args) {
		
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do pedido:");
		var codigo = sc.nextInt();
		System.out.println("----");
		System.out.print("Valor basico:");
		var valor = sc.nextDouble();
		System.out.println("----");
		System.out.print("Desconto (%):");
		var desconto = sc.nextDouble();
		System.out.println("----");
		
		Order order = new Order(codigo, valor, desconto);
		
		System.out.println("Pedido código: " +  order.getCode());
		System.out.println("Valor Bruto: " +  service.shipment(order));
		
		sc.close();

	}

}
