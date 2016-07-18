package com.niit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.po.Student;
import com.niit.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Resource(name = "studentService")
	private StudentService studentService;

	//list
	@RequestMapping("list")
	public String list(ModelMap model) throws Exception {
		List<Student> list = studentService.list();
		model.addAttribute("list", list);		
	    return "student/List";
	}
	
	//ɾ��
	@RequestMapping("delete")
	public String delect(HttpServletRequest request,ModelMap model) throws Exception {	
		String sno=request.getParameter("sno");
		studentService.delete(Integer.parseInt(sno));
		
		//springmvc���ض���
		return "redirect:/student/list";
	}
	
	//�޸Ļ������
	@RequestMapping("updateOrinsert")
	public String update(HttpServletRequest request,ModelMap model) throws Exception {	
		
		String sno=request.getParameter("sno").trim();
		String sname=request.getParameter("sname").trim();
		String ssex=request.getParameter("ssex").trim();
		String sage=request.getParameter("sage").trim();
		String sphone=request.getParameter("sphone").trim();
		String classno=request.getParameter("classno").trim();
		String dormno=request.getParameter("dormno").trim();
		
		Student student=new Student();
		student.setSno(Integer.parseInt(sno));
		student.setSname(sname);
		student.setSsex(ssex);
		student.setSage(Integer.parseInt(sage));
		student.setSphone(sphone);
		student.setClassno(Integer.parseInt(classno));
		student.setDormno(Integer.parseInt(dormno));
		
		studentService.editOrinsert(student);
		
		//springmvc���ض���
		return "redirect:/student/list";
	}
	
	// ���޸�ҳ��
	@RequestMapping("toupdate")
	public String toupdate(HttpServletRequest request, ModelMap model)throws Exception {
		
		String sno = request.getParameter("sno");
		if(sno!=null&&!sno.equals("")){
			Student stu=studentService.getStudentByNo(Integer.parseInt(sno));
			model.addAttribute("Student", stu);
		}else{
			model.addAttribute("student", null);
		}
		return "student/updateOrinsert";
	}

}
