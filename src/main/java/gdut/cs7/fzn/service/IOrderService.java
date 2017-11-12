package gdut.cs7.fzn.service;

import java.util.List;

import gdut.cs7.fzn.pojo.Order;

public interface IOrderService {
	public int addOrder(Order order);
	
	public List<Order> getOrders();
	
	public int setRoomOrderd(String type);
	

}
