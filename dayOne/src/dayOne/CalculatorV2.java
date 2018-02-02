package dayOne;

import java.util.Scanner;

public class CalculatorV2 {
	public static void main(String[] args) {

// Variable init - 20 & 15
double valueOne = 20;
double valueTwo = 15;

// Scanner Operations
Scanner scanOperand = new Scanner(System.in);
System.out.println("Operations between 20 and 15. Please select between '+' (add), '*' (multiply), '-' (subtract), '/' (divide), or '%' (modulo)");
char operand = scanOperand.next().charAt(0);

// IF Statements for 'operand' choice
if (operand == '+') 
{
	double sum = valueOne + valueTwo;
	System.out.println("Chosen operand: '+' (add): " +valueOne + " " + operand + " " + valueTwo + " = " + sum);
	System.out.println("Displaying Other Operands:");
	System.out.println("multiply: "+ valueOne + " * " + valueTwo + " = " + (valueOne*valueTwo));
	System.out.println("subtract: "+ valueOne + " - " + valueTwo + " = " + (valueOne-valueTwo));
	System.out.println("divide: "+ valueOne + " / " + valueTwo + " = " + (valueOne/valueTwo));
	System.out.println("modulo: "+ valueOne + " % " + valueTwo + " = " + (valueOne%valueTwo));
}
else if (operand == '-')
{
	double dif = valueOne - valueTwo;
	System.out.println("Chosen operand: '-' (subtract): " +valueOne + " " + operand + " " + valueTwo + " = " + dif);
	System.out.println("Displaying Other Operands:");
	System.out.println("add: "+ valueOne + " + " + valueTwo + " = " + (valueOne+valueTwo));
	System.out.println("multiply: "+ valueOne + " * " + valueTwo + " = " + (valueOne*valueTwo));
	System.out.println("divide: "+ valueOne + " / " + valueTwo + " = " + (valueOne/valueTwo));
	System.out.println("modulo: "+ valueOne + " % " + valueTwo + " = " + (valueOne%valueTwo));
}
else if (operand == '*')
{
	double pro = valueOne * valueTwo;
	System.out.println("Chosen operand: '*' (multiply): " +valueOne + " " + operand + " " + valueTwo + " = " + pro);
	System.out.println("Displaying Other Operands:");
	System.out.println("add: "+ valueOne + " + " + valueTwo + " = " + (valueOne+valueTwo));
	System.out.println("subtract: "+ valueOne + " - " + valueTwo + " = " + (valueOne-valueTwo));
	System.out.println("divide: "+ valueOne + " / " + valueTwo + " = " + (valueOne/valueTwo));
	System.out.println("modulo: "+ valueOne + " % " + valueTwo + " = " + (valueOne%valueTwo));
}
else if (operand == '/')
{
	double quo = valueOne / valueTwo;
	System.out.println("Chosen operand: '/' (divide): " +valueOne + " " + operand + " " + valueTwo + " = " + quo);
	System.out.println("Displaying Other Operands:");
	System.out.println("add: "+ valueOne + " + " + valueTwo + " = " + (valueOne+valueTwo));
	System.out.println("multiply: "+ valueOne + " * " + valueTwo + " = " + (valueOne*valueTwo));
	System.out.println("subtract: "+ valueOne + " - " + valueTwo + " = " + (valueOne-valueTwo));
	System.out.println("modulo: "+ valueOne + " % " + valueTwo + " = " + (valueOne%valueTwo));
}
else if (operand == '%')
{
	double mod = valueOne % valueTwo;
	System.out.println("Chosen operand: '%' (modulo): " +valueOne + " " + operand + " " + valueTwo + " = " + mod);
	System.out.println("Displaying Other Operands:");
	System.out.println("add: "+ valueOne + " + " + valueTwo + " = " + (valueOne+valueTwo));
	System.out.println("multiply: "+ valueOne + " * " + valueTwo + " = " + (valueOne*valueTwo));
	System.out.println("subtract: "+ valueOne + " - " + valueTwo + " = " + (valueOne-valueTwo));
	System.out.println("divide: "+ valueOne + " / " + valueTwo + " = " + (valueOne/valueTwo));
}
else
{
System.out.println("Please enter correct operand.");	
}
			}
}
