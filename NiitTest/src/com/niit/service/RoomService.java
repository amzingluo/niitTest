package com.niit.service;

import java.util.List;

import com.niit.po.Room;



public interface RoomService {
	/**
	 * 将所有数据获取出来
	 * @return
	 * @throws Exception
	 */
	public List<Room> list() throws Exception;
	/**
	 * 获取指定号的对象
	 * @return
	 * @throws Exception
	 */
	public Room getRoomByNo(int roomno) throws Exception;
	/**
	 * 修改或者增加信息
	 * @param Room
	 * @return
	 * @throws Exception
	 */
	public int editOrinsert(Room room) throws Exception;
	/**
	 * 删除指定号的信息
	 * @param Roomno
	 * @return
	 * @throws Exception
	 */
	public int delete(int roomno) throws Exception;
	/**
	 * 获取表的表头
	 * @return list
	 * @throws Exception
	 */
	public List<String> getHead() throws Exception;
}
