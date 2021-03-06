package com.mars.aws.rds;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@RequestMapping("/orders")
public class SpringbootAwsCodebuildApplication {

	@Autowired
	private OrderDao orderDao;
	
	@GetMapping	
	public List<Order> fetchOrder() {
		return orderDao.getOrders();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsCodebuildApplication.class, args);
	}

}
