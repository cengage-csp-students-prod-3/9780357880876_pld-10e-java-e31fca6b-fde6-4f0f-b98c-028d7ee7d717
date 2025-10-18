import javax.swing.*;

public class DayCare
{
    public static void main(String args[]) 
    {
        // Initialize two-dimensional array for weekly rates
        // Rows: age groups (0,1,2,3,4+), Columns: number of days (1-5)
        double[][] rates = {
            {30.0, 60.0, 88.0, 115.0, 140.0},  // Age 0
            {26.0, 52.0, 70.0, 96.0, 120.0},   // Age 1
            {24.0, 46.0, 67.0, 89.0, 110.0},   // Age 2
            {22.0, 40.0, 60.0, 75.0, 88.0},    // Age 3
            {20.0, 35.0, 50.0, 66.0, 84.0}     // Age 4+
        };
        
        int numDays;   
        int age = 0;
        String numDaysString;
        String ageString;
        int QUIT = 99;

        // Priming read: get the age of the first child
        ageString = JOptionPane.showInputDialog("Enter the age of the child or 99 to quit: ");
        age = Integer.parseInt(ageString);

        while(age != QUIT)
        {   
            // Ask the user to enter the number of days
            numDaysString = JOptionPane.showInputDialog("Enter number of days: ");
            numDays = Integer.parseInt(numDaysString);

            // Determine weekly rate
            int row; // age index
            if(age >= 4)
                row = 4;
            else
                row = age;
            int col = numDays - 1; // days index (0-based)
            double weeklyRate = rates[row][col];

            // Print the weekly rate
            System.out.println("Weekly charge is $" + weeklyRate);

            // Ask for next child's age
            ageString = JOptionPane.showInputDialog("Enter the age of the child or 99 to quit: ");
            age = Integer.parseInt(ageString);
        }

        // End of program
        System.out.println("End of program");
    } 
}
