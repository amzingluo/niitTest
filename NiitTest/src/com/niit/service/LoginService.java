package com.niit.service;

import java.util.List;

import com.niit.po.Room;



public interface LoginService {
	/**
	 * µÇÂ½ÑéÖ¤
	 * @return
	 * @throws Exception
	 */
	public boolean check(String countid,String password) throws Exception;
}
