package org.guili.ecshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class Test {

	@RequestMapping(value = "/login.htm",method = RequestMethod.POST)
    @ResponseBody
    public Result testLogin(String userName,String password) {
    	
		Result result=new Result();
		result.setName("post userName:"+userName);
		result.setPassword("post password:"+password);
		return result;
    }

	@RequestMapping(value = "/testLogin.htm",method = RequestMethod.GET)
	@ResponseBody
	public Result testLogin1(String userName,String password) {

		Result result=new Result();
		result.setName("get userName:"+userName);
		result.setPassword("get password:"+password);
		return result;
	}
	
	class Result{
		private String name;
		private String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}
