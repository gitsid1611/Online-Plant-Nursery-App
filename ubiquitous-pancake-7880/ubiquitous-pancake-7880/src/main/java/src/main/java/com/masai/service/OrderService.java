package src.main.java.com.masai.service;

import java.util.List;

import src.main.java.com.masai.exception.OrderException;
import src.main.java.com.masai.model.Orders;

public interface OrderService {
	public Orders addOrder(Orders order,Integer planterId,Integer customerId, String user) throws OrderException;

	public Orders updateOrder(Orders order, String user) throws OrderException;

	public Orders deleteOrder(int BookingOrderId, String user) throws OrderException;

	public Orders viewOrder(int BookingOrderId, String user) throws OrderException;

	public List<Orders> viewAllOrder(String user) throws OrderException;
}
