package com.employeeapp.data;

public class EmployeeApp_SoftwareDev extends EmployeeAppData {
	
	public void computeSalary() {
		if (HOURS_WORKED == 0.0) {
			totalSalary = 0.0;
		} else {
			totalSalary = (salary * HOURS_WORKED) * TAX;
		}
	}
}
