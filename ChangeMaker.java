package com.claim;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an amount: "); // SCANNER IN A USER AMOUNT
		
		int amount = in.nextInt();		// GET FEEDBACK IN CHANGE AMOUNT FROM USER
		int quarters, dimes, nickels, pennies;  // DECLARE DATATYPE FOR THE CHANGE...IN THIS CASE ITS INTEGERS
		
		quarters = amount / 25;   // THE MATH IS TO DIVIDE THE AMOUNT BY THE PLACE VALUE OF A QUARTER, DIME, OR NICKEL.  NOT THE PENNY THOUGH
		amount = amount % 25;
		
		dimes = amount/ 10;
		amount = amount % 10;
		
		nickels = amount / 5;
		amount = amount % 5;
		
		pennies = amount;
		
		System.out.println("Change you get is: ");
		System.out.println("Quarters: " +quarters);
		System.out.println("Dimes: " +dimes);
		System.out.println("Nickels: " +nickels);
		System.out.println("Pennies: " +pennies);
	}

}
//takes user input 
//
//displays the change breakdown as output
//
//1. Understand and Define the Problem 
//
// ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,
//
//
//
//2. Determine Input and Output 
//
//Typed input by user: amount of change requested (an integer between 1 and 99) 
//
//Printed output:  
//
//Number of quarters given  
//
//Number of dimes given  
//
//Number of nickels given  
//
//Number of pennies given
//
//Note: if there are no quarters as change we should not display "0 quarter". Only print the expected change. Example change = 6 cents
//Output should be: 
//1 Nickels 
//1 Pennies 