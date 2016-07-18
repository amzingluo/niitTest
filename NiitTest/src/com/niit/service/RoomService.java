package com.niit.service;

import java.util.List;

import com.niit.po.Room;



public interface RoomService {
	/**
	 * ���������ݻ�ȡ����
	 * @return
	 * @throws Exception
	 */
	public List<Room> list() throws Exception;
	/**
	 * ��ȡָ���ŵĶ���
	 * @return
	 * @throws Exception
	 */
	public Room getRoomByNo(int roomno) throws Exception;
	/**
	 * �޸Ļ���������Ϣ
	 * @param Room
	 * @return
	 * @throws Exception
	 */
	public int editOrinsert(Room room) throws Exception;
	/**
	 * ɾ��ָ���ŵ���Ϣ
	 * @param Roomno
	 * @return
	 * @throws Exception
	 */
	public int delete(int roomno) throws Exception;
	/**
	 * ��ȡ��ı�ͷ
	 * @return list
	 * @throws Exception
	 */
	public List<String> getHead() throws Exception;
}
