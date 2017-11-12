package gdut.cs7.fzn.service;

import gdut.cs7.fzn.pojo.User;

public interface IUserService {

	
	public User getUserByUserName(String user);
	
	public User getUserByJobNum(Integer jobNum);
	
	public int updateUserByJobNum(User record);
}
