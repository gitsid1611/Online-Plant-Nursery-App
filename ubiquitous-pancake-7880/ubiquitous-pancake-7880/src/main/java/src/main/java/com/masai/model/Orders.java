package src.main.java.com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	private Integer bookingOrderId;
	@NonNull
	private String orderTransactionMode;
	@NonNull
	private Integer quantity;
	@NonNull
	private Integer totalCost;
	public Orders(Integer bookingOrderId, String orderTransactionMode, Integer quantity, Integer totalCost) {
		super();
		this.bookingOrderId = bookingOrderId;
		this.orderTransactionMode = orderTransactionMode;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBookingOrderId() {
		return bookingOrderId;
	}
	public void setBookingOrderId(Integer bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}
	public String getOrderTransactionMode() {
		return orderTransactionMode;
	}
	public void setOrderTransactionMode(String orderTransactionMode) {
		this.orderTransactionMode = orderTransactionMode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "Orders [bookingOrderId=" + bookingOrderId + ", orderTransactionMode=" + orderTransactionMode
				+ ", quantity=" + quantity + ", totalCost=" + totalCost + "]";
	}
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Planter planters;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Customer customer;*/
	
	
	
}
