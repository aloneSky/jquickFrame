package com.quickwork.main.sys.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.quickwork.main.sys.user.dao.UserDao;

@Controller
public class LoginController {
	@Autowired
	public UserDao userDao;
	@RequestMapping("login")
	public ModelAndView login(){
		//userDao.find();
		return new ModelAndView("hello");
	}
}
