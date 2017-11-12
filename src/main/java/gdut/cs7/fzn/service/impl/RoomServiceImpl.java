package gdut.cs7.fzn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import gdut.cs7.fzn.dao.RoomMapper;
import gdut.cs7.fzn.pojo.Room;
import gdut.cs7.fzn.pojo.RoomExample;
import gdut.cs7.fzn.service.IRoomService;

@Service("roomService")
public class RoomServiceImpl implements IRoomService {
	@Resource
    private RoomMapper roomMapper;
	@Override
	public List<Room> getRooms() {
		// TODO Auto-generated method stub
		RoomExample roomExample = new RoomExample();
		return this.roomMapper.selectByExample(roomExample);
	}
	@Override
	public int changeRoomStatus(Integer flag, Integer roomNum) {
		// TODO Auto-generated method stub
		return this.roomMapper.updateIsEmpty(flag, roomNum);
	}
	@Override
	public int changeRoomOrderStatus(Integer flag, Integer roomNum) {
		// TODO Auto-generated method stub
		return this.roomMapper.updateIsOrder(flag, roomNum);
	}

}
