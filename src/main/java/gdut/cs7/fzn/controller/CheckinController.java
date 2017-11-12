package gdut.cs7.fzn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.CustomerMsg;
import gdut.cs7.fzn.pojo.Room;
import gdut.cs7.fzn.service.ICheckinService;
import gdut.cs7.fzn.service.IRoomService;

@Controller
@RequestMapping("checkin")
public class CheckinController {
	@Resource
	private ICheckinService checkinService;
	
	@Resource
	private IRoomService roomService;
	
	@RequestMapping(value = "/check.do",method = RequestMethod.POST)
	@ResponseBody
	public void checkin(@RequestBody CustomerCheckinMsg msg) {
		if(null != msg){
		  CustomerMsg cmsg = new CustomerMsg();
		  Room room = new Room();
		  cmsg.setName(msg.getName());
		  cmsg.setIdNum(msg.getIdNum());
		  cmsg.setSex(msg.getSex());
		  cmsg.setPhoneNum(msg.getPhoneNum());
		  room.setRoomNum(msg.getRoomNum());
		  checkinService.addMsg(msg);
		  checkinService.addCustomerMsg(cmsg);
		  checkinService.setRoomLived(room);
//		  roomService.changeRoomOrderStatus(1, msg.getRoomNum());
		}	
	}
	
	@RequestMapping(value = "/searchCmsg.do")
	@ResponseBody
	public List<CustomerMsg> searchCustomerMsg() {
		return this.checkinService.getCustomerMsg();
				
	}

}
