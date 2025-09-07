// Airline.java - This program determines if an airline passenger is eligible for a 25% discount. 

import javax.swing.*;

public class Airline 
{
	public static void main(String args[]) 
	{
		String passengerName = ""; 	// Passenger's name.
		String ageString = "";  // String version of passenger's age.
		int passengerAge = 0; 	// Passenger's age.

		passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
		ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
		
		passengerAge = Integer.parseInt(ageString);
		
		// Test to see if this customer is eligible for a 25% discount. 
				
	}
}