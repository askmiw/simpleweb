package com.ynssdata.web;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

import com.jfinal.template.Engine;

import cn.miw.simple.SimpleWeb;
import cn.miw.simple.SimpleWebDispatcher;

@WebServlet(urlPatterns = "/*")
@MultipartConfig
public class Config extends SimpleWebDispatcher {

	private static final long serialVersionUID = 1L;

	@Override
	public void config(SimpleWeb me) {
	}

}
