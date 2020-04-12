package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcs.dao.CustomerDao;
import com.tcs.entity.Customer;

@Controller
@RequestMapping("/customer")

public class CustomerController {
	
	@Autowired(required = true)
	private CustomerDao dao;
	
	@RequestMapping("/list")
	public String listCustomer(Model model) {
		System.out.println("inside controller");
		List<Customer>theCustomer =  dao.getCustomerDetail();
		model.addAttribute("theCust",theCustomer);
		return "list-view";
		
	}
	
}
