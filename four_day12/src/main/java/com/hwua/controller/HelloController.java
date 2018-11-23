package com.hwua.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello.action")
	public ModelAndView dohello(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("success");
		// 添加数据
		List<String> slist = new ArrayList<String>();
		slist.add("测试数据1 ");
		slist.add("测试数据2 ");
		slist.add("测试数据3 ");
		slist.add("测试数据4 ");
		// 添加模型
		mv.addObject("slist", slist);
		return mv;
	}
}
