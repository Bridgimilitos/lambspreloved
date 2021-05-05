package com.lambspreloved.app;

import com.lambspreloved.app.domain.business.Customer;
import com.lambspreloved.app.domain.business.Item;
import com.lambspreloved.app.domain.business.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootTest
class AppApplicationTests 
{

	@Test
	void contextLoads() 
	{
	}

	@Test
	@DisplayName("An item can be added to an order")
	void testAddItem()
	{
		Item newItem = new Item("T shirt", new BigDecimal(5), "Cancer Research");

		Order order = new Order(UUID.randomUUID(), new Customer(), new BigDecimal(3.20), newItem);

		Assertions.assertEquals(newItem, order.getItems().get(0));
	}

}
