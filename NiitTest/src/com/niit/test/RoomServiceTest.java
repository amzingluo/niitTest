package com.niit.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.po.Room;
import com.niit.service.RoomService;


//≤‚ ‘RoomService
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class RoomServiceTest {
	@Resource(name = "roomService")
	private RoomService roomService;
	
	@Test
	public void Testlist() throws Exception {
		roomService.list();
	}
	
	@Test
	public void TestgetRoomByNo() throws Exception {
		roomService.getRoomByNo(1);
	}
	
	@Test
	public void Testinsert() throws Exception {
		Room room = new Room();
		room.setRaddress("guangdong");
		room.setRname("Jordan Room");
		room.setRno(2);
		room.setRphone("15864212693");
		room.setLeaderid(1);;
		room.setBednum(6);
		roomService.editOrinsert(room);
	}
	@Test
	public void Testdelete() throws Exception {
		roomService.delete(2);
	}
}
