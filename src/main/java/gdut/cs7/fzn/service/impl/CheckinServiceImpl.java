package gdut.cs7.fzn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import gdut.cs7.fzn.dao.CustomerCheckinMsgMapper;
import gdut.cs7.fzn.dao.CustomerMsgMapper;
import gdut.cs7.fzn.dao.RoomMapper;
import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.CustomerMsg;
import gdut.cs7.fzn.pojo.CustomerMsgExample;
import gdut.cs7.fzn.pojo.Room;
import gdut.cs7.fzn.service.ICheckinService;

@Service("checkinService")
public class CheckinServiceImpl implements ICheckinService {
	@Resource
	private CustomerCheckinMsgMapper checkinMapper;
	
	@Resource
	private CustomerMsgMapper msgMapper;
	
	@Resource
	private RoomMapper roomMapper;

	@Override
	public int addMsg(CustomerCheckinMsg msg) {
		return this.checkinMapper.insertV2(msg);
	}

	@Override
	public int addCustomerMsg(CustomerMsg cmsg) {
		return this.msgMapper.insert(cmsg);
	}

	@Override
	public List<CustomerMsg> getCustomerMsg() {
		// TODO Auto-generated method stub
		CustomerMsgExample example = new CustomerMsgExample();
		return this.msgMapper.selectByExample(example);
	}

	@Override
	public int setRoomLived(Room room) {
		// TODO Auto-generated method stub
		return this.roomMapper.updateIsEmpty(1, room.getRoomNum());
	}

}
