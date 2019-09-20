package com.allstate.training.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MyController {
@RequestMapping("/add")
public String getMethod(HttpServletRequest request)
{
	int a=13,b=90;
	int sum=a+b;
	request.setAttribute("as",sum);
	System.out.println("console Output"+(a+b));
	return "index.jsp";
}
@RequestMapping("/add1")
public ModelAndView getData()
{
	int a=13,b=90;
	int sum=a+b;
	ModelAndView mv=new ModelAndView();
	mv.setViewName("display.jsp");
	mv.addObject("result",sum);
	return mv;
}
@RequestMapping(value="/Login",method=RequestMethod.GET)
public String getMethod()
{
	return "login";
}

@RequestMapping(value="/Login",method=RequestMethod.POST)
public ModelAndView getLogin(@RequestParam("lname")String uname,@RequestParam("pass")String pass)
{
ModelAndView mv=new ModelAndView();
if(uname.contains("all"))
{
	mv.addObject("uname",uname);
	mv.setViewName("welcome");
}
else
{
	mv.addObject("result","invalid credential");
	mv.setViewName("login");
}
return mv;
}
}
