package src.main.java.com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import src.main.java.com.masai.exception.OrderException;
import src.main.java.com.masai.model.Orders;
import src.main.java.com.masai.service.OrderService;

@RestController
public class Controller {


	@Autowired
	OrderService orderservice;

	@PostMapping("/orders")
	public ResponseEntity<Orders> OrderHandler(@RequestBody Orders orders) throws OrderException{
		
		
		Orders addOrder= orderservice.addOrder(orders, null, null, null);
		
		return new ResponseEntity<Orders>(addOrder, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/udateOrder")
	public ResponseEntity<Orders> updateOrderHandler(@RequestBody Orders orders) throws OrderException{
		
		Orders updatedOrders= orderservice.updateOrder(orders, null);
		
		return new ResponseEntity<Orders>(updatedOrders,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<Orders> deleteOrder(@PathVariable("id") Orders id) throws OrderException{
		
		Orders deletedOrder= orderservice.deleteOrder(id, null);
		
		return new ResponseEntity<Orders>(deletedOrder, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<Orders> getIdByOrder(@PathVariable("id") Integer id) throws OrderException{
		
		Orders OrderbyId= orderservice.viewOrder(id, null);
		
		return new ResponseEntity<Orders>(OrderbyId, HttpStatus.OK);
		
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Orders>> getAllOrderHandler() throws OrderException{
		
		List<Orders> AllOrders= orderservice.viewAllOrder(null);
		
		
		return new ResponseEntity<List<Orders>>(AllOrders,HttpStatus.OK);
	}
	

}
