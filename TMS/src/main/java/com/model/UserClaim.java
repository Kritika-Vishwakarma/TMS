package com.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UserClaim {
	
	@NotNull(message ="{error.expenseAmount}")
	@Min(value = 0,message="{error.expenseAmount.negative}")
	
	private String expenseType;
	private double expenseAmt;
	private String employeeId;
	
	public String getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	public double getExpenseAmt() {
		return expenseAmt;
	}
	public void setExpenseAmt(double expenseAmt) {
		this.expenseAmt = expenseAmt;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
}
