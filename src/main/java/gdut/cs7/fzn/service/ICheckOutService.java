package gdut.cs7.fzn.service;

import java.util.List;

import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.EvaluateMsg;

public interface ICheckOutService {
	public List<CustomerCheckinMsg> getCheckinMsg();
	
	public int setEvaluationMsg(EvaluateMsg msg);
	
	public int updateRoom(Integer oldRoom, Integer newRoom, String name);
	
	public int deleteMsg(CustomerCheckinMsg msg);

}
