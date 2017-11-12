package gdut.cs7.fzn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import gdut.cs7.fzn.dao.CustomerCheckinMsgMapper;
import gdut.cs7.fzn.dao.EvaluateMsgMapper;
import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.CustomerCheckinMsgExample;
import gdut.cs7.fzn.pojo.EvaluateMsg;
import gdut.cs7.fzn.service.ICheckOutService;

@Service("checkOutService")
public class CheckOutServiceImpl implements ICheckOutService {
	@Resource
	private CustomerCheckinMsgMapper mapper;
	
	@Resource
	private EvaluateMsgMapper evaluateMsgMapper;

	@Override
	public List<CustomerCheckinMsg> getCheckinMsg() {
		// TODO Auto-generated method stub
		CustomerCheckinMsgExample example = new CustomerCheckinMsgExample();
		return this.mapper.selectByExample(example);
	}

	@Override
	public int setEvaluationMsg(EvaluateMsg msg) {
		// TODO Auto-generated method stub
		return this.evaluateMsgMapper.insertV2(msg);
	}

	@Override
	public int updateRoom(Integer oldRoom, Integer newRoom, String name) {
		// TODO Auto-generated method stub
		return this.mapper.updateRoom(oldRoom, newRoom, name);
	}

	@Override
	public int deleteMsg(CustomerCheckinMsg msg) {
		// TODO Auto-generated method stub
		return this.mapper.deleteByRoomNum(msg.getRoomNum());
	}

	
	

}
