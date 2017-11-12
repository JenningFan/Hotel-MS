package gdut.cs7.fzn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import gdut.cs7.fzn.dao.OrderMapper;
import gdut.cs7.fzn.dao.RoomMapper;
import gdut.cs7.fzn.pojo.Order;
import gdut.cs7.fzn.pojo.OrderExample;
import gdut.cs7.fzn.service.IOrderService;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {
	@Resource
	private OrderMapper orderMapper;
	
	@Resource
	private RoomMapper roomMapper;

	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return this.orderMapper.insertV2(order);
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		OrderExample orderExample = new OrderExample();
		return this.orderMapper.selectByExample(orderExample);
	}

	@Override
	public int setRoomOrderd(String type) {
		// TODO Auto-generated method stub
		return this.roomMapper.setRoomOrderd(type);
	}
	
	

}
