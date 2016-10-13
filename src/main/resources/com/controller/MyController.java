package com.controller;
@Controller
public class MyController {
         
	public MyController() {
		// TODO Auto-generated constructor stub
		System.out.println("in controller");
	}
	
	 @RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello()
	{
		return "hello";
		
	}
	
	
}
