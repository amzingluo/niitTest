package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.mapper.RoomMapper;
import com.niit.mapper.StudentMapper;
import com.niit.po.Room;
import com.niit.po.Student;
import com.niit.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> list() throws Exception {
		return studentMapper.list();
	}

	@Override
	public Student getStudentByNo(int studentno) throws Exception {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(studentno);
	}

	@Override
	public int editOrinsert(Student student) throws Exception {
		int id=student.getSno();
		if(getStudentByNo(id)==null){
			return studentMapper.insert(student);
		}else{
			return studentMapper.updateByPrimaryKeySelective(student);
		}
	}

	@Override
	public int delete(int studentno) throws Exception {
		return studentMapper.deleteByPrimaryKey(studentno);
	}


}
