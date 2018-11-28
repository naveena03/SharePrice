package com.cg.SharePrice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.SharePrice.dto.SharePrice;
import com.cg.SharePrice.service.SharePriceservice;


@Controller
public class MyController {
	@Autowired
	SharePriceservice service;
	@RequestMapping("getlist")
	public String showList(Model model) {
		System.out.println("In controller");
		List<SharePrice> list = service.getAll();
		model.addAttribute("list",list);
		return "home";
}
}
