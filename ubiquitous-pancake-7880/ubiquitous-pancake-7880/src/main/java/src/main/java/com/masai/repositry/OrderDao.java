package src.main.java.com.masai.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.com.masai.model.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

}
