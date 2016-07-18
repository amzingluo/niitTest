package com.niit.service;

import java.util.List;

import com.niit.po.Room;
import com.niit.po.Student;


public interface StudentService {
	/**
	 * ������ѧ�����ݻ�ȡ����
	 * @return
	 * @throws Exception
	 */
	public List<Student> list() throws Exception;
	
	/**
	 * ��ȡָ��ѧ���ŵ�ѧ��
	 * @return
	 * @throws Exception
	 */
	public Student getStudentByNo(int studentno) throws Exception;
	/**
	 * �޸Ļ���������Ϣ
	 * @param Room
	 * @return
	 * @throws Exception
	 */
	public int editOrinsert(Student stu) throws Exception;
	
	/**
	 * ɾ��ָ��ѧ���ŵ�������Ϣ
	 * @param dormno
	 * @return
	 * @throws Exception
	 */
	public int delete(int studentno) throws Exception;
	
	
}
