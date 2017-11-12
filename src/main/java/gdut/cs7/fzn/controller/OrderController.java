package gdut.cs7.fzn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import gdut.cs7.fzn.pojo.Order;
import gdut.cs7.fzn.service.IOrderService;

@Controller
@RequestMapping("order")
public class OrderController {
	@Resource
	private IOrderService orderService;
	
	@RequestMapping(value = "/addOrder.do",method = RequestMethod.POST)
	@ResponseBody
	public void addOrder(@RequestBody Order order) {
		if(null != order && null != order.getPhoneNum()) {
			//添加预订订单信息
			orderService.addOrder(order);
			//改变room表内，随机选取符合类型的房间置为已预订
			orderService.setRoomOrderd(order.getType());
		}
	}
	
	@RequestMapping(value = "/getOrder.do",method = RequestMethod.GET)
	@ResponseBody
	public List<Order> getOrder() {
	    return this.orderService.getOrders();
	}
	
}
