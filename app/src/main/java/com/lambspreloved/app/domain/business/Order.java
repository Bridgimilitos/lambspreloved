package com.lambspreloved.app.domain.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import lombok.Getter;

@Getter
public class Order 
{
	private UUID id;
    private OrderStatus status;
    private List<Item> items;
    private Customer customer;
    private BigDecimal postagePrice;
    
    public Order(UUID id, Customer customer, BigDecimal postagePrice, Item... items) 
    {
        this.id = id;
        this.customer = customer;
        this.postagePrice = postagePrice;
        this.items = new ArrayList<>(Arrays.asList(items));
        this.status = OrderStatus.PENDING;
    }
    
    public BigDecimal getPrice()
    {    	
    	//TODO
        //return items.stream().map(x -> x.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
    	BigDecimal total = postagePrice;
        for (Item item : items)
        {
        	total = total.add(item.getPrice());
        }

        return total;
    }

    public void complete() 
    {
        validateState();
        this.status = OrderStatus.COMPLETED;
    }

    private void validateState()
    {
    	//TODO
	}

	public void addItem(Item item)
    {
        validateState();
//        validateProduct(product);
        items.add(item);
    }

    public boolean removeItem(UUID itemId)
    {
        validateState();
        return items.removeIf(item -> item.getId().equals(itemId));
    }
}
