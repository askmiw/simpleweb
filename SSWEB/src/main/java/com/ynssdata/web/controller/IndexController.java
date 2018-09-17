package com.ynssdata.web.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.ynssdata.web.model.User;

import cn.miw.simple.annotations.Mapping;
import cn.miw.simple.beans.ModelAndView;

@Mapping
public class IndexController {
	//打开首页
	@Mapping("/")
	public ModelAndView index(ModelAndView view) {
		view.set("user", new User(1,"我是简单网站"));
		view.setView("index.html");
		return view;
	}
	//用户提交然后返回json格式数据
	public User post(User user) {
		return user;
	}
	//提交数据并保存在session
	public ModelAndView postToIndex(User user,HttpSession session) {
		ModelAndView view = new ModelAndView("index.html");
		session.setAttribute("user", user);
		return view;
	}
	//跳转到首页
	public String fake4Index() {
		return "r:/";
	}
	//这是内部重定向到首页,请注意浏览器中的地址
	public String fake4Index2() {
		return "f:/";
	}
	public ModelAndView getParam(int id) {
		User user = new User(id, "第"+id+"号用户");
		ModelAndView view = new ModelAndView("index.html");
		view.set("user", user);
		return view;
	}
	public File upAndDown(User user) {
		System.out.println("用户提交上来的信息:"+JSON.toJSONString(user));
		return user.getFile();
	}
}
