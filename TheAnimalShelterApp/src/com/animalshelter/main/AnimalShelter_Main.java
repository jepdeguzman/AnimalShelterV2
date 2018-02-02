package com.animalshelter.main;

import org.apache.log4j.Logger;

import com.animalshelter.ui.AnimalShelter_UI;

public class AnimalShelter_Main {

	
public static void main(String[] args) {
	
	Logger myLogger = Logger.getLogger(AnimalShelter_Main.class);
	myLogger.trace("Trace Message!");
	myLogger.debug("Debug Message!");
	myLogger.info("Info Message!");
	myLogger.warn("Warn Message!");
	myLogger.error("Error Message!");
	myLogger.fatal("Fatal Message!");
	
	
	AnimalShelter_UI asUI = new AnimalShelter_UI();
	//asUI.mt_mainMenu();
}


}
