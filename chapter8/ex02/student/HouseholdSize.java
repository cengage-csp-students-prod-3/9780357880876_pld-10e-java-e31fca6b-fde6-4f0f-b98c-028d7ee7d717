import javax.swing.*;

public class HouseholdSize
{
    public static void main(String args[]) 
    {
        final int SIZE = 300;			// Maximum number of household sizes.
        int householdSizes[] = new int[SIZE];   // Array to store household sizes.
        int x = 0;                            // Counter for number of entries
        int householdSize = 0; 
        String householdSizeString;
        int temp;
        double sum = 0; 
        double mean = 0;
        double median = 0;

        // Input household size
        householdSizeString = JOptionPane.showInputDialog("Enter household size or 999 to quit: ");
        householdSize = Integer.parseInt(householdSizeString);

        while(x < SIZE && householdSize != 999)   
        {
            // Place value in array
            householdSizes[x] = householdSize;
            // Add to total sum for mean
            sum += householdSize;
            x++;    // Next input
            householdSizeString = JOptionPane.showInputDialog("Enter household size or 999 to quit: ");
            householdSize = Integer.parseInt(householdSizeString); 
        }

        int numEntries = x; // total number of valid entries

        // Calculate the mean
        if(numEntries > 0)
            mean = sum / numEntries;

        // Bubble sort the array in ascending order
        for(int i = 0; i < numEntries - 1; i++)
        {
            for(int j = 0; j < numEntries - i - 1; j++)
            {
                if(householdSizes[j] > householdSizes[j+1])
                {
                    temp = householdSizes[j];
                    householdSizes[j] = householdSizes[j+1];
                    householdSizes[j+1] = temp;
                }
            }
        }

        // Calculate the median
        if(numEntries > 0)
        {
            if(numEntries % 2 == 0) // even number of entries
                median = (householdSizes[numEntries/2 - 1] + householdSizes[numEntries/2]) / 2.0;
            else // odd number of entries
                median = householdSizes[numEntries/2];
        }

        // Print the results
        System.out.println("Mean household size in Marengo is : " + mean);
        System.out.println("Median household size in Marengo is: " + median);
    }
}
