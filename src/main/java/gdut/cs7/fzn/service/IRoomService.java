package gdut.cs7.fzn.service;

import java.util.List;

import gdut.cs7.fzn.pojo.Room;

public interface IRoomService {
	
	public List<Room> getRooms();
	
	public int changeRoomStatus(Integer flag, Integer roomNum);
	
	public int changeRoomOrderStatus(Integer flag, Integer roomNum);

}
