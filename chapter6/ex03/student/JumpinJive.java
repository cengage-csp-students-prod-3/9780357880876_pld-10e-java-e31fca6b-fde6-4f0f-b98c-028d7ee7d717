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

        while (!addIn.equals("XXX")) 
        {
            foundIt = false;
            int i = 0;

            // Task 1: Use a while loop to search the array
            while (i < NUM_ITEMS) 
            {
                if (addIn.equals(addIns[i])) 
                {
                    foundIt = true;
                    JOptionPane.showMessageDialog(null, 
                        "Add-in: " + addIns[i] + "\nPrice: $" + addInPrices[i]);
                    orderTotal += addInPrices[i];
                    break; // exit search loop
                }
                i++;
            }

            // Task 2: If not found, show error message
            if (!foundIt) 
            {
                JOptionPane.showMessageDialog(null, "Sorry, we do not carry that.");
            }

            // Prompt again
            addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");
        }

        // Print total order cost
        JOptionPane.showMessageDialog(null, "Total order cost: $" + orderTotal);
    } 
}

