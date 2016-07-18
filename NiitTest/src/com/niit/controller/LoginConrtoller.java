package com.niit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginConrtoller {

	@Resource(name = "loginService")
	private LoginService loginService;

	// ȥ��½����
	@RequestMapping("tologin")
	public String list(HttpServletRequest request,ModelMap model) throws Exception {
		String error = request.getParameter("error");
		model.addAttribute("error", error);
		
		return "login/login";
	}

	// ������룬����������ص���½���棬�����ȷ������������
	@RequestMapping("check")
	public String delect(HttpServletRequest request, ModelMap model)throws Exception {
		
		String countid = request.getParameter("countid").trim();
		String password = request.getParameter("password").trim();

		boolean check = loginService.check(countid, password);
		if (check) {
			// springmvc���ض���
			return "redirect:/room/list";
		} else {
			// springmvc���ض���
			return "redirect:/login/tologin?error=Password Error!!";
		}

	}

}
