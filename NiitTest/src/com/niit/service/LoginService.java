package com.niit.service;

import java.util.List;

import com.niit.po.Room;



public interface LoginService {
	/**
	 * ��½��֤
	 * @return
	 * @throws Exception
	 */
	public boolean check(String countid,String password) throws Exception;
}
