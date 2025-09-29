// MichiganCities.java - This program prints a message for invalid cities in Michigan.  
// Input:  Interactive.
// Output:  Error message or nothing.

import javax.swing.*;

public class MichiganCities
{
    public static void main(String args[]) throws Exception
    {
        // Declare variables.
        String inCity;  // name of city to look up in array.
        // Initialized array of cities in Michigan.
        String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"}; 
        boolean foundIt = false;  // Flag variable.

        // Get user input.
        inCity = JOptionPane.showInputDialog("Enter name of city: ");
            
        // Task 1: Write your loop here.
        for(int i = 0; i < citiesInMichigan.length; i++)
        {
            // Task 2: Write your test statement here.
            if(inCity.equals(citiesInMichigan[i])) 
            {
                foundIt = true;
                break; // no need to keep searching
            }
        }
        
        // Task 2: Test to see if city was not found
        if(foundIt)
            JOptionPane.showMessageDialog(null, "City found.");
        else
            JOptionPane.showMessageDialog(null, "Not a city in Michigan.");
    } 
}

        
        
        