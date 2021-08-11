package com.dipinder.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String displayDate(Model model) {
		SimpleDateFormat simpledatafo = new SimpleDateFormat("MM/dd/yyyy");
		Date newDate = new Date();
		String expectedDate= simpledatafo.format(newDate);
		model.addAttribute("date",expectedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String displayTime(Model model) {
		SimpleDateFormat simpledatafo = new SimpleDateFormat("hh:mm");
		Date newDate = new Date();
		String expectedDate= simpledatafo.format(newDate);
		model.addAttribute("date",expectedDate);
		return "time.jsp";
	}
}
