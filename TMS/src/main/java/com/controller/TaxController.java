package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.UserClaim;
import com.service.TaxService;

@Controller
public class TaxController {
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private Validator validator;
	
	@RequestMapping(value = "/getTaxClaimFormPage",method=RequestMethod.GET)
	public String discountPage(@ModelAttribute("userClaim") UserClaim userClaim) {
		userClaim =new UserClaim();
		return "taxclaim";
	}
	
	@RequestMapping(value = "/calculateTax",method=RequestMethod.GET)
	public String calculateTax(@ModelAttribute("userclaim")UserClaim userClaim, ModelMap map, BindingResult result) {
		validator.validate(userClaim, result);
		if(result.hasErrors()) {
			return "taxclaim";
		}else {
			double taxAmount=taxService.calculateTax(userClaim);
			map.addAttribute("taxAmount", taxAmount);
			return "result";
		}
	}

	@ModelAttribute("productTypeList")
	public List<String> populateProductType(){
		List<String> expenseList=new ArrayList<String>();
		expenseList.add("MedicalExpense");
		expenseList.add("TravelExpense");
		expenseList.add("FoodExpense");
		return expenseList;
	}
}
