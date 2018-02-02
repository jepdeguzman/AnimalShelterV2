package com.employeeapp.ui;

import java.util.Scanner;

import com.employeeapp.data.EmployeeAppData;
import com.employeeapp.data.EmployeeApp_ComputeSalary;
import com.employeeapp.data.EmployeeApp_DoWork;
import com.employeeapp.data.EmployeeApp_HR;
import com.employeeapp.data.EmployeeApp_SoftwareDev;
import com.employeeapp.data.EmployeeApp_SoftwareTester;
import com.employeeapp.main.EmployeeAppMain;

public class EmployeeAppUI {
	public int createEmployeeChoice;
	public EmployeeAppData[] employeeMainArray = new EmployeeAppData[10];
	//public boolean addMore = true;
	
	public void mt_displayMainMenu() {
		System.out.println("EMPLOYEE APP");
		System.out.println("\nPLEASE CHOOSE");
		System.out.println("[1] CREATE EMPLOYEE");
		System.out.println("[2] DO WORK");
		System.out.println("[3] DISPLAY SALARY");
		System.out.print("CMD: ");
		Scanner scanMainMenuChoice = new Scanner(System.in);
		int mainMenuChoice = scanMainMenuChoice.nextInt();
		mt_mainMenuChoice(mainMenuChoice);
	}
	
	public void mt_mainMenuChoice(int mainMenuChoice) {
		if (mainMenuChoice == 1) {
			mt_displayCreateEmployeeMenu();
		}else if (mainMenuChoice == 2) {
			EmployeeApp_DoWork empAppDoWork = new EmployeeApp_DoWork();
			empAppDoWork.doWork(employeeMainArray);
		}else if (mainMenuChoice == 3) {
			EmployeeApp_ComputeSalary empAppCompSal = new EmployeeApp_ComputeSalary();
			empAppCompSal.displaySalary(employeeMainArray);
		}else {
			System.out.println("INVALID INPUT. PLEASE TRY AGAIN.");
			System.out.println("--------------------------------");
			mt_displayMainMenu();
		}
	}
	
	public void mt_displayCreateEmployeeMenu() {
		EmployeeAppData empAppData = new EmployeeAppData();
		System.out.println("CREATE EMPLOYEE");
		System.out.println("[1] SOFTWARE DEV");
		System.out.println("[2] SOFTWARE TESTER");
		System.out.println("[3] HR");
		System.out.print("CMD: ");
		Scanner scanCreateEmployeeChoice = new Scanner(System.in);
		createEmployeeChoice = scanCreateEmployeeChoice.nextInt();
		
		if (createEmployeeChoice == 1 || createEmployeeChoice == 2 || createEmployeeChoice == 3) {
			mt_createEmployee(createEmployeeChoice);
		}else {
			System.out.println("INVLD INPUT");
			mt_displayCreateEmployeeMenu();
		}
	}
	
	public void mt_createEmployee(int createEmployeeChoice) {
		String employeeFirstName; //local First Name to be passed
		String employeeLastName;  //local Last Name to be passed
		EmployeeAppData empAppData = new EmployeeAppData();
		if(empAppData.counter < 10) {
			System.out.print("ENTER EMPLOYEE FIRST NAME:");
			Scanner scanEmployeeFirstName = new Scanner(System.in);
			employeeFirstName = scanEmployeeFirstName.next();
			System.out.print("ENTER EMPLOYEE LAST NAME: ");
			Scanner scanEmployeeLastName = new Scanner(System.in);
			employeeLastName = scanEmployeeLastName.next();
			
			if(createEmployeeChoice == 1) {
				EmployeeAppData softwareDevEmp = new EmployeeApp_SoftwareDev();
				softwareDevEmp.employeeType = "Software Developer";
				softwareDevEmp.firstName = employeeFirstName;
				softwareDevEmp.lastName = employeeLastName;
				softwareDevEmp.salary = 850.00;
				
				employeeMainArray[empAppData.counter] = softwareDevEmp;
					
					if(empAppData.counter <= 9) {
					System.out.println("DO YOU WANT TO ADD MORE EMPLOYEES OR INPUT WORK HOURS?");
					System.out.println("[1] ADD MORE EMPLOYEES");
					System.out.println("[2] INPUT WORK HOURS");
					System.out.print("CMD: ");
					Scanner scanAddMoreChoiceOne = new Scanner (System.in);
					int addMoreChoiceOne = scanAddMoreChoiceOne.nextInt();
						if(addMoreChoiceOne == 1) {
							mt_displayCreateEmployeeMenu();
						}else if(addMoreChoiceOne == 2) {
							mt_displayMainMenu();
						}
					}
			} 
			else if(createEmployeeChoice == 2){
				EmployeeAppData softwareTesterEmp = new EmployeeApp_SoftwareTester();
				softwareTesterEmp.employeeType = "Software Tester";
				softwareTesterEmp.firstName = employeeFirstName;
				softwareTesterEmp.lastName = employeeLastName;
				softwareTesterEmp.salary = 850.00;
				
				employeeMainArray[empAppData.counter] = softwareTesterEmp;
				
				if(empAppData.counter <= 9) {
				System.out.println("DO YOU WANT TO ADD MORE EMPLOYEES OR INPUT WORK HOURS?");
				System.out.println("[1] ADD MORE EMPLOYEES");
				System.out.println("[2] INPUT WORK HOURS");
				System.out.print("CMD: ");
				Scanner scanAddMoreChoiceTwo = new Scanner (System.in);
				int addMoreChoiceTwo = scanAddMoreChoiceTwo.nextInt();
					if(addMoreChoiceTwo == 1) {
						mt_displayCreateEmployeeMenu();
					}else if(addMoreChoiceTwo == 2) {
						mt_displayMainMenu();
					}
				}
			}
			else if(createEmployeeChoice == 3) {
				EmployeeAppData hrEmp = new EmployeeApp_HR();
				hrEmp.employeeType = "HR";
				hrEmp.firstName = employeeFirstName;
				hrEmp.lastName = employeeLastName;
				hrEmp.salary = 400.00;
				
				employeeMainArray[empAppData.counter] = hrEmp;
				
				if(empAppData.counter <= 9) {
				System.out.println("DO YOU WANT TO ADD MORE EMPLOYEES OR INPUT WORK HOURS?");
				System.out.println("[1] ADD MORE EMPLOYEES");
				System.out.println("[2] INPUT WORK HOURS");
				System.out.print("CMD: ");
				Scanner scanAddMoreChoiceThree = new Scanner (System.in);
				int addMoreChoiceThree = scanAddMoreChoiceThree.nextInt();
					if(addMoreChoiceThree == 1) {
						mt_displayCreateEmployeeMenu();
					}else if(addMoreChoiceThree == 2) {
						mt_displayMainMenu();
					}
				}
			}
			empAppData.counter++;
		}else {
			
			}
		mt_displayCreateEmployeeMenu();
	}
}
/*if(counter <=9) {
	while(true) {
		System.out.println("DO YOU WANT TO ADD MORE EMPLOYEES?");
		System.out.println("[1] YES");
		System.out.println("[2] NO");
		System.out.print("CMD: ");
		Scanner scanNotFullChoice = new Scanner(System.in);
		int notFullChoice = scanNotFullChoice.nextInt();
		if(notFullChoice == 1) {
			mt_displayMainMenu();
		}else if(notFullChoice == 2) {
			int lastCount = counter + 1;
			System.out.println("EMPLOYEE LIST #: "+lastCount);
			return;
		}else {
			System.out.println("INVLD INPUT.");
			continue;
		}
	}
}else{
	while(addMore = true) {
		System.out.println("LIST IS FULL. WHAT DO YOU WANT TO DO NOW?");
		System.out.println("[1] RESET");
		System.out.println("[2] BACK");
		System.out.print("CMD: ");
		Scanner scanFullChoice = new Scanner(System.in);
		int fullChoice = scanFullChoice.nextInt();
		if(fullChoice == 1) {
			counter = 0;
			System.out.println();
			employeeMainArray = new EmployeeAppData[10];
			mt_displayMainMenu();
		}else if(fullChoice == 2) {
			int fullCounter = counter + 1;
			return;
		}else {
			System.out.println("INVLD INPUT.");
			continue;
			}

*/