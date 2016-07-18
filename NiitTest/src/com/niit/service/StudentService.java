package com.niit.service;

import java.util.List;

import com.niit.po.Room;
import com.niit.po.Student;


public interface StudentService {
	/**
	 * 将所有学生数据获取出来
	 * @return
	 * @throws Exception
	 */
	public List<Student> list() throws Exception;
	
	/**
	 * 获取指定学生号的学生
	 * @return
	 * @throws Exception
	 */
	public Student getStudentByNo(int studentno) throws Exception;
	/**
	 * 修改或者增加信息
	 * @param Room
	 * @return
	 * @throws Exception
	 */
	public int editOrinsert(Student stu) throws Exception;
	
	/**
	 * 删除指定学生号的宿舍信息
	 * @param dormno
	 * @return
	 * @throws Exception
	 */
	public int delete(int studentno) throws Exception;
	
	
}
