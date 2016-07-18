package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.mapper.LoginMapper;
import com.niit.mapper.RoomMapper;
import com.niit.po.Login;
import com.niit.po.Room;
import com.niit.service.LoginService;
import com.niit.service.RoomService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;

	@Override
	public boolean check(String countid, String password) throws Exception {
		// TODO Auto-generated method stub

		//空值情况下
		if(countid==null||countid.equals("")){
			return false;
		}
		
		Login login = loginMapper.selectByPrimaryKey(countid);

		String realpassword= login.getPassword();
		boolean cheakReturn=false;
		if(realpassword.equals(password)){
			cheakReturn=true;
		}

		return cheakReturn;
	}

}
