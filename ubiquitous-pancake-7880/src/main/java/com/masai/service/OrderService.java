package com.masai.service;

import java.util.List;

import com.masai.exception.OrderException;
import com.masai.model.Orders;

public interface OrderService {
	public Orders addOrder(Orders order,Integer planterId,Integer customerId, String user) throws OrderException;

	public Orders updateOrder(Orders order, String user) throws OrderException;

	public Orders deleteOrder(Orders BookingOrderId, String user) throws OrderException;

	public Orders viewOrder(int BookingOrderId, String user) throws OrderException;

	public List<Orders> viewAllOrder(String user) throws OrderException;

}
