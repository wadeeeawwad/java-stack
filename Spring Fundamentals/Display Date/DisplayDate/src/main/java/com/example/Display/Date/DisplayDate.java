package com.example.Display.Date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDate {
	@RequestMapping("")
	public String homepage(){
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String Date(Model mysystem){
		
		Date newdate=new Date( );
		mysystem.addAttribute("TodayDate", newdate);
		return "date.jsp";
	}
	@RequestMapping("/Time")
	public String Time(Model mysystem){
		
		Format newtime=new SimpleDateFormat("hh:mm:ss a");
		String strtime=newtime.format(new Date());
		mysystem.addAttribute("TodayTime", strtime);
		return "time.jsp";
	}



}
