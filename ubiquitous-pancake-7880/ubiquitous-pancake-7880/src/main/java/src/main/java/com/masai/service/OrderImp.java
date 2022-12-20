package src.main.java.com.masai.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.com.masai.exception.OrderException;
import src.main.java.com.masai.model.Orders;
import src.main.java.com.masai.repositry.OrderDao;
@Service
public class OrderImp implements OrderService{

	@Autowired
	private OrderDao cdao;
	@Override
	public Orders addOrder(Orders order, Integer planterId, Integer customerId, String user) throws OrderException {
		
		Orders saveOrder=cdao.save(order);
		return saveOrder;
	}

	@Override
	public Orders updateOrder(Orders order, String user) throws OrderException {
		// TODO Auto-generated method stub
		Optional<Orders> opt=cdao.findById(order.getBookingOrderId());
		if(opt.isPresent()) {
			Orders sus=cdao.save(order);
			
		}else {
			throw new OrderException("Invalid Order Details");
		}
		return opt.get();
	}

	@Override
	public Orders deleteOrder(Orders BookingOrderId, String user) throws OrderException {
		// TODO Auto-generated method stub
		Optional<Orders> opt=cdao.findById(BookingOrderId.getBookingOrderId());
		if(opt.isEmpty()) {
			throw new OrderException("Order Not Found");
		}else {
			cdao.delete(BookingOrderId);
		}
		return opt.get();
	}

	@Override
	public Orders viewOrder(int BookingOrderId, String user) throws OrderException {
		return cdao.findById(BookingOrderId).orElseThrow(() ->
		new OrderException("Oders does not exist with roll :" +BookingOrderId));
	}

	@Override
	public List<Orders> viewAllOrder(String user) throws OrderException {
		List<Orders> orders= cdao.findAll();

		if (orders.size() == 0)
			throw new OrderException("No Order found..");
		else
			return orders;
	}

}
