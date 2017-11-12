package gdut.cs7.fzn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import gdut.cs7.fzn.dao.IUserDao;
import gdut.cs7.fzn.dao.UserMapper;
import gdut.cs7.fzn.pojo.User;
import gdut.cs7.fzn.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;

	public User getUserByUserName(String user) {
		return this.userMapper.selectByUserName(user);
	}
	
	public User getUserByJobNum(Integer jobNum) {
		return this.userMapper.selectByPrimaryKey(jobNum);
	}
	
	public int updateUserByJobNum(User record) {
		return this.userMapper.updateByPrimaryKey(record);
	}
	
	
	

}
