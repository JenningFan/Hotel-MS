package gdut.cs7.fzn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import gdut.cs7.fzn.pojo.ChangeRoomMsg;
import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.EvaluateMsg;
import gdut.cs7.fzn.service.ICheckOutService;
import gdut.cs7.fzn.service.IRoomService;
import gdut.cs7.fzn.service.impl.RoomServiceImpl;

@Controller
@RequestMapping("checkOut")
public class CheckOutController {
	@Resource
	private ICheckOutService checkOutService;
	
	@Resource
	private IRoomService roomService;
	
	@RequestMapping("getCheckOutMsg.do")
	@ResponseBody
	public List<CustomerCheckinMsg> getCheckOutMsg() {
		return this.checkOutService.getCheckinMsg();
	}
	
	@RequestMapping(value = "evaluate.do", method = RequestMethod.POST)
	@ResponseBody
	public void setEvaluation(@RequestBody EvaluateMsg msg) {
		if(null != msg) {
			this.checkOutService.setEvaluationMsg(msg);
		}		
	}
	
	@RequestMapping(value = "changeRoom.do", method = RequestMethod.POST)
	@ResponseBody
	public void changeRoom(@RequestBody ChangeRoomMsg msg) {
		if(null != msg.getOldRoom() && null != msg.getNewRoom() && null != msg.getName()) {
			this.checkOutService.updateRoom(msg.getOldRoom(), msg.getNewRoom(), msg.getName());
			//置新房号为非空，旧房号为空
			this.roomService.changeRoomStatus(1, msg.getNewRoom());
			this.roomService.changeRoomStatus(0, msg.getOldRoom());
			
		}		
	}
	
	@RequestMapping(value = "exit.do", method = RequestMethod.POST)
	@ResponseBody
	public void checkOut(@RequestBody CustomerCheckinMsg msg) {
		if(null != msg.getRoomNum()) {
			this.checkOutService.deleteMsg(msg);
			//退房时重新置房间为空
			this.roomService.changeRoomStatus(0, msg.getRoomNum());
		}
		
	}

}
