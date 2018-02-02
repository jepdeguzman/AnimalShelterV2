package com.employeeapp.data;

import com.employeeapp.data.EmployeeAppData;
import com.employeeapp.data.EmployeeApp_ComputeSalary;
import com.employeeapp.data.EmployeeApp_DoWork;
import com.employeeapp.data.EmployeeApp_HR;
import com.employeeapp.data.EmployeeApp_SoftwareDev;
import com.employeeapp.data.EmployeeApp_SoftwareTester;
import com.employeeapp.main.EmployeeAppMain;
import com.employeeapp.ui.EmployeeAppUI;

public class EmployeeApp_SoftwareTester extends EmployeeAppData {
	
	public void computeSalary() {
		if (HOURS_WORKED == 0.0) {
			totalSalary = 0.0;
		} else {
			totalSalary = ((salary * HOURS_WORKED) * NIGHT_DIFF) * TAX;
		}
	}
}
