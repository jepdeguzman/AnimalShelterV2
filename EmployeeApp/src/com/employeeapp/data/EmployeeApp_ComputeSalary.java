package com.employeeapp.data;

import com.employeeapp.data.EmployeeAppData;
import com.employeeapp.data.EmployeeApp_ComputeSalary;
import com.employeeapp.data.EmployeeApp_DoWork;
import com.employeeapp.data.EmployeeApp_HR;
import com.employeeapp.data.EmployeeApp_SoftwareDev;
import com.employeeapp.data.EmployeeApp_SoftwareTester;
import com.employeeapp.main.EmployeeAppMain;
import com.employeeapp.ui.EmployeeAppUI;

public class EmployeeApp_ComputeSalary {
	
	public static int i;
	public static int o;

	public void computeSalary(EmployeeAppData[] employeeMainArray) {
		for (i = 0; i < employeeMainArray.length; i++) {
			if(employeeMainArray[i] == null) {
				System.out.println();break;
			}else {
				EmployeeAppData employeeData = employeeMainArray[i];
				if(employeeData.employeeType.equalsIgnoreCase("Software Developer")) {
					((EmployeeApp_SoftwareDev) employeeMainArray[i]).computeSalary();
				}else if(employeeData.employeeType.equalsIgnoreCase("Software Tester")) {
					((EmployeeApp_SoftwareTester) employeeMainArray[i]).computeSalary();
				}else if(employeeData.employeeType.equalsIgnoreCase("HR")) {
					((EmployeeApp_HR) employeeMainArray[i]).computeSalary();
				}
			}
		}
		return;
	}
	
	public void displaySalary(EmployeeAppData[] employeeMainArray) {
		mainLoop: for (i = 0; i < employeeMainArray.length;) {
			if(employeeMainArray[i] == null) {
				if(i==0) {
					System.out.println("NO EMPLOYEES FOUND. ENTER EMPLOYEES FIRST.");
					EmployeeAppUI empAppUI = new EmployeeAppUI();
					empAppUI.mt_displayMainMenu();
				}
				break;
			}else {
				computeSalary(employeeMainArray);
				subLoop: for(o = 0; o < employeeMainArray.length; o++) {
					if(employeeMainArray[o] == null) {
						break subLoop;
					}else {
						if (employeeMainArray[o].HOURS_WORKED == 0.0) {
							System.out.println(employeeMainArray[o].firstName + " " + employeeMainArray[o].lastName + " HAS WORKED " + employeeMainArray[o].HOURS_WORKED + " HOURS TODAY");
						}else {
							System.out.println(employeeMainArray[o].employeeType);
							System.out.println(employeeMainArray[o].firstName +" "+employeeMainArray[o].lastName);
							System.out.println("SALARY: "+employeeMainArray[o].totalSalary);
						}
					}
				}
				break mainLoop;
			}
		}
	}

}
