package com.niit.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.po.Student;
import com.niit.service.StudentService;

//≤‚ ‘StudentService
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class StudentServiceTest {

	@Resource(name = "studentService")
	private StudentService studentService;
	
	@Test
	public void Testlist() throws Exception {
		studentService.list();
	}
	
	@Test
	public void TestgetRoomByNo() throws Exception {
		studentService.getStudentByNo(1);
	}
	
	@Test
	public void Testinsert() throws Exception {
		Student stu = new Student();
		stu.setClassno(1);
		stu.setDormno(1);
		stu.setSage(21);
		stu.setSname("jordan");
		stu.setSno(2);
		stu.setSphone("15864212693");
		stu.setSsex("male");

		studentService.editOrinsert(stu);
	}
	@Test
	public void Testdelete() throws Exception {
		studentService.delete(2);
	}
	
}
