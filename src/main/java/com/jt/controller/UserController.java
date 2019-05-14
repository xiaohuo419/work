package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.pojo.User;
import com.jt.service.UserService;
import com.jt.vo.SysResult;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/findAll")
	public String findAll(Model model){
		List<User> userList=
		userService.findAll();
		//利用request对象数据封装到域中
		model.addAttribute("userList", userList);
		//利用response对象将页面转发展现
		return "userList";
	}
	//实现页面跳转
	@RequestMapping("/updateUser")
	public String showUpdate(){
		return "updateUser";
	}
	/**
	 * SpringMVC可以接收用户提交数据.之后调用setXXX()
	 * 为属性赋值.
	 * @param user
	 * @return
	 */
	//实现用户新增操作
	@RequestMapping("/addUser")
	@ResponseBody
	public SysResult addUser(User user){
		try {
			userService.addUser(user);
			return new SysResult(200,"用户入库成功!!!",null);
		} catch (Exception e) {
			e.printStackTrace();
			return new SysResult(201,"用户入库失败!!!",null);
		}
	}
}
