package com.masai.model;

import java.time.LocalDate;

public class OrderDTO2 {

	
	private Integer orderId;
	private Integer quantity;
	private Integer totalPrice;
	private LocalDate orderDate;
	
	
	
	public OrderDTO2() {
		// TODO Auto-generated constructor stub
	}



	public OrderDTO2(Integer orderId, Integer quantity, Integer totalPrice, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}



	public Integer getOrderId() {
		return orderId;
	}



	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}



	public Integer getQuantity() {
		return quantity;
	}



	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}



	public Integer getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}



	public LocalDate getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}



	@Override
	public String toString() {
		return "OrderDTO2 [orderId=" + orderId + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", orderDate=" + orderDate + "]";
	}
	
	
	
	
	
}
