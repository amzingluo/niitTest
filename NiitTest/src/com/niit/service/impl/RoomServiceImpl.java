package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.mapper.RoomMapper;
import com.niit.po.Room;
import com.niit.service.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomMapper roomMapper;

	@Override
	public List<Room> list() throws Exception {
		return roomMapper.list();
	}

	@Override
	public Room getRoomByNo(int Roomno) throws Exception {
		return roomMapper.selectByPrimaryKey(Roomno);
	}

	public int insert(Room Room) throws Exception {
		return roomMapper.insert(Room);
	}

	@Override
	public int editOrinsert(Room Room) throws Exception {	
		int id=Room.getRno();
		if(getRoomByNo(id)==null){
			return roomMapper.insert(Room);
		}else{
			return roomMapper.updateByPrimaryKeySelective(Room);
		}
	}

	@Override
	public int delete(int Roomno) throws Exception {
		return roomMapper.deleteByPrimaryKey(Roomno);
	}

	@Override
	public List<String> getHead() throws Exception {
		return null;
	}
	
	
	

}
