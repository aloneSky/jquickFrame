package com.quickwork.main.sys.login;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.quickwork.main.sys.user.dao.UserDao;

@Controller
public class LoginController {
	@Autowired
	public UserDao userDao;
	@RequestMapping("login")
	public String login(Model model){
		List<Map<String, Object>> users = userDao.find();
		model.addAttribute("name", "this is thymeleaf name!!");
		return "hello";
	}
}
