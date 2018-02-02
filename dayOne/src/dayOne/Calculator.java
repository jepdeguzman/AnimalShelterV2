package dayOne;

import java.util.Scanner;
//import java.io.*;
public class Calculator {
	public static void main(String[] args) {
		
int addOne;
Scanner scanAddOne = new Scanner(System.in);
System.out.println("Enter first number to be added: ");
addOne = scanAddOne.nextInt();
int addTwo;
Scanner scanAddTwo = new Scanner(System.in);
System.out.println("Enter second number to be added: ");
addTwo = scanAddOne.nextInt();
int sum = addOne + addTwo;

int mulOne;
Scanner scanMulOne = new Scanner(System.in);
System.out.println("Enter first number to be multiplied: ");
mulOne = scanMulOne.nextInt();
int mulTwo;
Scanner scanMulTwo = new Scanner(System.in);
System.out.println("Enter first number to be multiplied: ");
mulTwo = scanMulTwo.nextInt();
int prod = mulOne*mulTwo;

int subOne;
Scanner scanSubOne = new Scanner(System.in);
System.out.println("Enter minuend (To be subtacted from): ");
subOne = scanSubOne.nextInt();
int subTwo;
Scanner scanSubTwo = new Scanner(System.in);
System.out.println("Enter subtrahend (To be subtacted): ");
subTwo = scanSubTwo.nextInt();
int diff = subOne - subTwo;

double divOne;
Scanner scanDivOne = new Scanner(System.in);
System.out.println("Enter dividend: ");
divOne = scanDivOne.nextDouble();
double divTwo;
Scanner scanDivTwo = new Scanner(System.in);
System.out.println("Enter divisor: ");
divTwo = scanDivTwo.nextDouble();
double quot = divOne/divTwo;

int modOne;
Scanner scanModOne = new Scanner(System.in);
System.out.println("[Modulo] Enter first number: ");
modOne = scanModOne.nextInt();
int modTwo;
Scanner scanModTwo = new Scanner(System.in);
System.out.println("[Modulo] Enter second number: ");
modTwo = scanModTwo.nextInt();
int modu = modOne%modTwo;

System.out.println("\n");
System.out.println("\n");
System.out.println("\n");


System.out.println(addOne + " + " + addTwo + " = " + sum);
System.out.println(mulOne + " + " + mulTwo + " = " + prod);
System.out.println(subOne + " + " + subTwo + " = " + diff);
System.out.println(divOne + " + " + divTwo + " = " + quot);
System.out.println(modOne + " + " + modTwo + " = " + modu);

	}
	
}