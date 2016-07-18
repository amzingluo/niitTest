package com.niit.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.po.Room;
import com.niit.service.LoginService;
import com.niit.service.RoomService;


//≤‚ ‘RoomService
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class LoginServiceTest {
	
	
	@Resource(name = "loginService")
	private LoginService loginService;
	
	@Test
	public void Testcheck() throws Exception {
		
		boolean check=loginService.check("1223", "1273");	
		
		System.out.print(" ========= "+check);
	}
}
