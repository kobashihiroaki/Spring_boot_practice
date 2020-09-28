package com.tuyano.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tuyano.springboot.repositories.MyDataRepository;

@Controller
public class Sample2Controller {
	@Autowired
	MyDataRepository repository;
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("sample2");
		mav.addObject("msg", "this is sample content");
		Iterable<MyData> list = repository.findAll();
		mav.addObject("data", list);
		return mav;
	}
}
