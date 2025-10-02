// JumpinJive.java - This program looks up and prints the names and prices of coffee orders.  
// Input:  Interactive.
// Output:  Name and price of coffee orders or error message if add-in is not found. 

import javax.swing.*;

public class JumpinJive
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables.
		final int NUM_ITEMS = 5; // Named constant
		String addIn;  // Add-in ordered by customer.
		boolean foundIt; 
		// Initialized array of add-ins.
		String addIns[] = {"Cream", "Cinnamon", "Chocolate", "Amaretto", "Whiskey"}; 
		// Initialized array of add-in prices.
		double addInPrices[] = {.89, .25, .59, 1.50, 1.75};
		double orderTotal = 2.00;  // All orders start with a 2.00 charge

		// Get user input.
		addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");

		// Task 1: Search the array for the name of the add-in
		foundIt = false;  // Reset flag each time
		for (int i = 0; i < NUM_ITEMS; i++)
		{
			if (addIn.equals(addIns[i]))  // If match found
			{
				foundIt = true;
				// (Task 2 will go here — print name/price & update total)
				break;  // Exit loop once found
			}
		}
	} 
}
