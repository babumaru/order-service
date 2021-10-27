package com.mars.aws.rds;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrders() {
		return Stream.of(new Order(101, "mobile",1, 3000), new Order(102,"Book", 3, 2000),new Order(205, "laptop", 4, 4544), new Order(900,"keyboard", 2, 50) ).collect(Collectors.toList());
	}
}
