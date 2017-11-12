package gdut.cs7.fzn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gdut.cs7.fzn.pojo.Room;
import gdut.cs7.fzn.service.IRoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
	@Resource
	private IRoomService roomService;
	
	@RequestMapping("/search.do")
	@ResponseBody
	public List<Room> getRooms() {
		return this.roomService.getRooms();
	}

}
