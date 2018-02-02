package com.corejava.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QuickExercise {
	
	public double totalBill;
	
	public static void main(String[] args) throws IOException {
		
		File groceryFile = new File("C:\\Users\\Jeremy De Guzman\\Documents\\groceries.txt");
		
		System.out.println(groceryFile.exists());
		
		double totalPrice = 0.0;
		
		try {
			
			FileReader groceryReader  = new FileReader(groceryFile);
			BufferedReader in = new BufferedReader(groceryReader);
			String groceryString;
		       while ((groceryString = in.readLine()) != null) {
		           System.out.println(groceryString);
		         }
		         in.close();
		         
		        // for(int i = 0; i < 3;i++) {
		         Scanner scanGrocery = new Scanner(groceryFile);
		         while(scanGrocery.hasNextLine()) {
		         String oneLine = scanGrocery.next();
		         String[] data = oneLine.split("\\|");
		         
		         System.out.println(data[0]);
		         System.out.println(data[1]);
		         System.out.println(data[2]);
		         
		         double groceryQuantity = Double.parseDouble(data[1]);
		         double groceryPricePerPiece = Double.parseDouble(data[2]);
		         
		         double totalGrocery = groceryQuantity*groceryPricePerPiece;
		         System.out.println(totalGrocery);
		         
/*		         Scanner scanGroceryTwo = new Scanner(groceryFile);
		         String all = scanGroceryTwo.next();*/
		         
		         totalPrice += totalGrocery;
		         }
		         
		         System.out.println(totalPrice);
		         File totalBillfile = new File("C:\\Users\\Jeremy De Guzman\\Documents\\totalBill.txt");
		         FileWriter totalBill = new FileWriter(totalBillfile, true);
		         PrintWriter writer = new PrintWriter(totalBill);
		         writer.print(totalPrice);
		         writer.flush();
		         

		         
		         
		         
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//split("|") = String[];
		
		

	}

}
