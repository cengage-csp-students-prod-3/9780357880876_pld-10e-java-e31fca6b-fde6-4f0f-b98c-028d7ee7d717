// This program calculates your age in the year 2050.
// Input:  None.
// Output: Your current age followed by your age in 2050.

public class NewAge
{
   public static void main(String args[])
   {
      final int YEAR = 2050;
      
      // Declare and initialize your variables here.
      int newAge; 

      int currentAge = 36;

      int currentYear = 2025;

newAge = currentAge + (YEAR - currentYear);

      System.out.println("My Current Age is " + currentAge);

      
      SSystem.out.println("I will be " + newAge + " in " + YEAR + ".");

      System.exit(0);
   }
}