package gdut.cs7.fzn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import gdut.cs7.fzn.pojo.User;
import gdut.cs7.fzn.service.IUserService;
import gdut.cs7.fzn.util.ResultMap;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	private IUserService userService;
	
	@RequestMapping(value = "/signin.do")
	@ResponseBody
	public ResultMap<User> login(@RequestBody User user, final HttpSession httpSession) {
		ResultMap<User> resultMap = new ResultMap<>();
		User user2 = userService.getUserByUserName(user.getUser());
		
		if(null != user.getUser() && null != user.getPassword() && user.getPassword().equals(user2.getPassword())) {
			httpSession.setAttribute("user", user2);
			resultMap.addResult(user2);	
			resultMap.setSuccess(true);
			return resultMap;
		} else {
			resultMap.addResult(user2);
			resultMap.setSuccess(false);
			return resultMap;
		}		
	}
	@RequestMapping(value = "/register.do")
	@ResponseBody
	public ResultMap<User> register(@RequestBody User user){
		ResultMap<User> resultMap = new ResultMap<>();
		User user2 = userService.getUserByJobNum(user.getJobNum());
		if(null != user2 && null != user && null != user.getUser() && null != user.getPassword()) {
			userService.updateUserByJobNum(user);
			resultMap.setSuccess(true);
			return resultMap;
		} else {
			resultMap.setSuccess(false);
			return resultMap;
		}		
	}
	
	@RequestMapping(value = "/isLogin.do")
	@ResponseBody
	public ResultMap<User> isLogin(final HttpSession httpsession) {
		ResultMap<User> resultMap = new ResultMap<>();
		User user = (User) httpsession.getAttribute("user");
		if(null != user) {
			resultMap.setSuccess(true);
			resultMap.addResult(user);
			return resultMap;
		} else {
			resultMap.setSuccess(false);
			return resultMap;
		}
	}
	
}
