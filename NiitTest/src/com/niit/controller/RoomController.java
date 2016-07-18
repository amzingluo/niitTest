package com.niit.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.po.Room;
import com.niit.service.RoomService;

@Controller
@RequestMapping("room")
public class RoomController {

	@Resource(name = "roomService")
	private RoomService roomService;

	//list
	@RequestMapping("list")
	public String list(ModelMap model) throws Exception {
		List<Room> list = roomService.list();
		model.addAttribute("list", list);		
	    return "room/List";
	}
	
	//删除
	@RequestMapping("delete")
	public String delect(HttpServletRequest request,ModelMap model) throws Exception {	
		String rno=request.getParameter("rno");
		roomService.delete(Integer.parseInt(rno));
		
		//springmvc的重定向
		return "redirect:/room/list";
	}
	
	//修改或者添加
	@RequestMapping("updateOrinsert")
	public String update(HttpServletRequest request,ModelMap model) throws Exception {	
		
		String rno=request.getParameter("rno").trim();
		String rname=request.getParameter("rname").trim();
		String raddress=request.getParameter("raddress").trim();
		String rphone=request.getParameter("rphone").trim();
		
		String leaderid=request.getParameter("leaderid").trim();
		String bednum=request.getParameter("bednum").trim();
		
		Room room=new Room();
		room.setRname(rname);
		room.setRno(Integer.parseInt(rno));
		room.setRaddress(raddress);
		room.setRphone(rphone);
		
		room.setLeaderid(Integer.parseInt(leaderid));
		room.setBednum(Integer.parseInt(bednum));
		
		roomService.editOrinsert(room);
		
		//springmvc的重定向
		return "redirect:/room/list";
	}
	
	// 跳转到修改页面
	@RequestMapping("toupdate")
	public String toupdate(HttpServletRequest request, ModelMap model)throws Exception {
		
		String rno = request.getParameter("rno");
		if(rno!=null&&!rno.equals("")){
			Room room=roomService.getRoomByNo(Integer.parseInt(rno));
			model.addAttribute("Room", room);
		}else{
			model.addAttribute("Room", null);
		}
		return "room/updateOrinsert";
	}

}
