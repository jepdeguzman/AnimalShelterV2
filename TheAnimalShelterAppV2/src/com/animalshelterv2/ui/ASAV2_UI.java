package com.animalshelterv2.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.animalshelterv2.beans.ASAV2_dog;
import com.animalshelterv2.manager.ASAV2_manager;

public class ASAV2_UI {
	public static ASAV2_dog asav2_dog = new ASAV2_dog();
	public static ASAV2_manager asav2_man = new ASAV2_manager();
	
	public static Map<Integer, String> dogShelterMap = new LinkedHashMap<Integer, String>();
	public static Map<Integer, String> catShelterMap = new LinkedHashMap<Integer, String>();
	public static Map<Integer, String> parShelterMap = new LinkedHashMap<Integer, String>();
	
	
	//DISPLAY HOME PAGE
	public static void mt_displayHomePage(){
		System.out.println("---");
		System.out.println("WELCOME TO JC'S ANIMAL SHELTER");
		System.out.println("WHICH SHELTER WOULD YOU LIKE TO VISIT?");
		System.out.println("[1] DOG SHELTER");
		System.out.println("[2] CAT SHELTER");
		System.out.println("[3] PARROT SHELTER");
		System.out.print("CMD: ");
		Scanner scanHomePageChoice = new Scanner(System.in);
		int homePageChoice = scanHomePageChoice.nextInt();
		switch(homePageChoice) {
		case 1:
			mt_displayDogShelterMenu();
			break;
		case 2:
			mt_displayCatShelterMenu();
			break;
		case 3:
			mt_displayParShelterMenu();
			break;
		default:
		}
	}
	
	//DISPLAY SHELTER MENU
	public static void mt_displayDogShelterMenu() {
		if(dogShelterMap.isEmpty()) {
				System.out.println("---");
			//	System.out.println("IS EMPTY? "+animalShelterMap.isEmpty());
				System.out.println("WELCOME TO THE DOG SHELTER!");
				System.out.println("MENU:");
				System.out.println("[1] ADD DOG");
				System.out.println("[0] GO BACK TO HOME PAGE");
				System.out.print("CMD: ");
				Scanner scanEmptyChoice = new Scanner(System.in);
				int emptyChoice = scanEmptyChoice.nextInt();
				if(emptyChoice == 1) {
					mt_displayAddDog();
				}else if(emptyChoice == 0) {
					mt_displayHomePage();
				}else {
					System.out.println("INVLD INPUT");
				}
			}else if(dogShelterMap.isEmpty() == false) {
				System.out.println("---");
				System.out.println("WELCOME TO THE DOG SHELTER!");
				System.out.println("MENU:");
				System.out.println("[1] ADD DOG");
				System.out.println("[2] REMOVE A DOG");
				System.out.println("[3] VIEW ALL DOGS");
				System.out.println("[0] GO BACK TO HOME PAGE");
				System.out.print("CMD: ");
				Scanner scanNotEmptyChoice = new Scanner(System.in);
				int notEmptyChoice = scanNotEmptyChoice.nextInt();
				if(notEmptyChoice == 1) {
					mt_displayAddDog();
				}else if(notEmptyChoice == 2) {
					asav2_man.mt_viewDogShelter();
					System.out.println("ENTER THE SERIAL NUMBER OF THE DOG YOU WANT TO REMOVE");
					System.out.print("CMD: ");
					asav2_man.mt_removeDog();
					System.out.println("SUCCESSFULLY DELETED!");
					mt_displayDogShelterMenu();
				}else if(notEmptyChoice == 3) {
					asav2_man.mt_viewDogShelter();
					mt_displayDogShelterMenu();
				}else if(notEmptyChoice == 0) {
					mt_displayHomePage();
				}else {
					System.out.println("INVLD INPUT");
				}
			}
	}
	
	public static void mt_displayCatShelterMenu() {
		if(catShelterMap.isEmpty()) {
			System.out.println("---");
		//	System.out.println("IS EMPTY? "+animalShelterMap.isEmpty());
			System.out.println("WELCOME TO THE CAT SHELTER!");
			System.out.println("MENU:");
			System.out.println("[1] ADD CAT");
			System.out.println("[0] GO BACK TO HOME PAGE");
			System.out.print("CMD: ");
			Scanner scanEmptyChoice = new Scanner(System.in);
			int emptyChoice = scanEmptyChoice.nextInt();
			if(emptyChoice == 1) {
				mt_displayAddCat();
			}else if(emptyChoice == 0) {
				mt_displayHomePage();
			}else {
				System.out.println("INVLD INPUT");
			}
		}else if(catShelterMap.isEmpty() == false) {
			System.out.println("---");
			System.out.println("WELCOME TO THE CAT SHELTER!");
			System.out.println("MENU:");
			System.out.println("[1] ADD CAT");
			System.out.println("[2] REMOVE A CAT");
			System.out.println("[3] VIEW ALL CATS");
			System.out.println("[0] GO BACK TO HOME PAGE");
			System.out.print("CMD: ");
			Scanner scanNotEmptyChoice = new Scanner(System.in);
			int notEmptyChoice = scanNotEmptyChoice.nextInt();
			if(notEmptyChoice == 1) {
				mt_displayAddCat();
			}else if(notEmptyChoice == 2) {
				asav2_man.mt_viewCatShelter();
				System.out.println("ENTER THE SERIAL NUMBER OF THE CAT YOU WANT TO REMOVE");
				System.out.print("CMD: ");
				asav2_man.mt_removeCat();
				System.out.println("SUCCESSFULLY DELETED!");
				mt_displayCatShelterMenu();
			}else if(notEmptyChoice == 3) {
				asav2_man.mt_viewCatShelter();
				mt_displayCatShelterMenu();
			}else if(notEmptyChoice == 0) {
				mt_displayHomePage();
			}else {
				System.out.println("INVLD INPUT");
				mt_displayHomePage();
			}
		}
	}
	
	public static void mt_displayParShelterMenu() {
		if(parShelterMap.isEmpty()) {
			System.out.println("---");
		//	System.out.println("IS EMPTY? "+animalShelterMap.isEmpty());
			System.out.println("WELCOME TO THE PARROT SHELTER!");
			System.out.println("MENU:");
			System.out.println("[1] ADD PARROT");
			System.out.println("[0] GO BACK TO HOME PAGE");
			System.out.print("CMD: ");
			Scanner scanEmptyChoice = new Scanner(System.in);
			int emptyChoice = scanEmptyChoice.nextInt();
			if(emptyChoice == 1) {
				mt_displayAddPar();
			}else if(emptyChoice == 0) {
				mt_displayHomePage();
			}else {
				System.out.println("INVLD INPUT");
			}
		}else if(parShelterMap.isEmpty() == false) {
			System.out.println("---");
			System.out.println("WELCOME TO THE PARROT SHELTER!");
			System.out.println("MENU:");
			System.out.println("[1] ADD PARROT");
			System.out.println("[2] REMOVE A PARROT");
			System.out.println("[3] VIEW ALL PARROTS");
			System.out.println("[0] GO BACK TO HOME PAGE");
			System.out.print("CMD: ");
			Scanner scanNotEmptyChoice = new Scanner(System.in);
			int notEmptyChoice = scanNotEmptyChoice.nextInt();
			if(notEmptyChoice == 1) {
				mt_displayAddPar();
			}else if(notEmptyChoice == 2) {
				asav2_man.mt_viewParShelter();
				System.out.println("ENTER THE SERIAL NUMBER OF THE PARROT YOU WANT TO REMOVE");
				System.out.print("CMD: ");
				asav2_man.mt_removePar();
				System.out.println("SUCCESSFULLY DELETED!");
				mt_displayParShelterMenu();
			}else if(notEmptyChoice == 3) {
				asav2_man.mt_viewParShelter();
				mt_displayParShelterMenu();
			}else if(notEmptyChoice == 0) {
				mt_displayHomePage();
			}else {
				System.out.println("INVLD INPUT");
				mt_displayHomePage();
			}
		}
	}

	//DISPLAY ADD MENU
	public static void mt_displayAddDog() {
		System.out.println("---");
		System.out.println("ADD DOG PAGE");
		ASAV2_manager.mt_addDog();
	}
	
	public static void mt_displayAddCat() {
		System.out.println("---");
		System.out.println("ADD CAT PAGE");
		ASAV2_manager.mt_addCat();
	}
	
	public static void mt_displayAddPar() {
		System.out.println("---");
		System.out.println("ADD PARROT PAGE");
		ASAV2_manager.mt_addPar();
	}
	
	//DISPLAY FULL MENU
	public static void mt_displayDogFullMenu() {
		System.out.println("---");
		System.out.println("DOG SHELTER IS NOW FULL!");
		System.out.println("WHAT DO YOU LIKE TO DO?");
		System.out.println("[1] VIEW ALL DOGS");
		System.out.println("[2] DELETE DOG");
		System.out.println("[0] RETURN TO HOME PAGE");
		System.out.print("CMD: ");
	}
	
	public static void mt_displayCatFullMenu() {
		System.out.println("---");
		System.out.println("CAT SHELTER IS NOW FULL!");
		System.out.println("WHAT DO YOU LIKE TO DO?");
		System.out.println("[1] VIEW ALL CATS");
		System.out.println("[2] DELETE CAT");
		System.out.println("[0] RETURN TO HOME PAGE");
		System.out.print("CMD: ");
	}
	
	public static void mt_displayParFullMenu() {
		System.out.println("---");
		System.out.println("PARROT SHELTER IS NOW FULL!");
		System.out.println("WHAT DO YOU LIKE TO DO?");
		System.out.println("[1] VIEW ALL PARROTS");
		System.out.println("[2] DELETE PARROT");
		System.out.println("[0] RETURN TO HOME PAGE");
		System.out.print("CMD: ");
	}

	//DISPLAY REMOVE MENU
	public static void mt_displayDogRemoveMenu() {
		System.out.println("---");
		System.out.println("WHICH DOG WOULD YOU LIKE TO REMOVE? [SN] EX. 1");
		System.out.print("CMD: ");
	}
	
	public static void mt_displayCatRemoveMenu() {
		System.out.println("---");
		System.out.println("WHICH CAT WOULD YOU LIKE TO REMOVE? [SN] EX. 1");
		System.out.print("CMD: ");
	}
	
	public static void mt_displayParRemoveMenu() {
		System.out.println("---");
		System.out.println("WHICH PARROT WOULD YOU LIKE TO REMOVE? [SN] EX. 1");
		System.out.print("CMD: ");
	}

}
