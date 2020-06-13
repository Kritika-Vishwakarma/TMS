package com.service;

import org.springframework.stereotype.Service;

import com.model.UserClaim;

@Service
public class TaxServiceImpl implements TaxService{

	@Override
	public double calculateTax(UserClaim userClaim) {
		String expenseType = userClaim.getExpenseType();
		double expenseAmt = userClaim.getExpenseAmt();
		double taxAmount = 0.0;
		double taxPercentage = 0.0;
		
		if(expenseType.equalsIgnoreCase("MedicalExpense")){
			if(expenseAmt >= 0 && expenseAmt <= 1000){
				taxPercentage = .15;
			}else if(expenseAmt >= 1001 && expenseAmt <= 10000){
				taxPercentage = .20;
			}else if(expenseAmt >= 10000){
				taxPercentage = .25;
			}
		}else if(expenseType.equalsIgnoreCase("TravelExpense")){
			if(expenseAmt >= 0 && expenseAmt <= 1000){
				taxPercentage = .1;
			}else if(expenseAmt >= 1001 && expenseAmt <= 10000){
				taxPercentage = .15;
			}else if(expenseAmt >= 10000){
				taxPercentage = .20;
			}
		} else if(expenseType.equalsIgnoreCase("FoodExpense")){
			if(expenseAmt >= 0 && expenseAmt <= 1000){
				taxPercentage = .05;
			}else if(expenseAmt >= 1001 && expenseAmt <= 10000){
				taxPercentage = .1;
			}else if(expenseAmt >= 10000){
				taxPercentage = .15;
			}
		}
		
		taxAmount = expenseAmt * taxPercentage;
		return taxAmount;
	}
}