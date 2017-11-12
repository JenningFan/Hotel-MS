package gdut.cs7.fzn.service;

import java.util.List;

import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.CustomerMsg;
import gdut.cs7.fzn.pojo.Room;


public interface ICheckinService {
	public int addMsg(CustomerCheckinMsg msg);
	
	public int addCustomerMsg(CustomerMsg cmsg);
	
	public List<CustomerMsg> getCustomerMsg();
	
	public int setRoomLived(Room room);

}
