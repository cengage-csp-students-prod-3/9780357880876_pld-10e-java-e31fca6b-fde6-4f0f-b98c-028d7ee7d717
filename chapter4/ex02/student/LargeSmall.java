
public class LargeSmall 
{
    public static void main(String args[])
    {
        // Three numbers are already declared
        int firstNumber = 78;
        int secondNumber = -50;
        int thirdNumber = 12;

        int largest;    // Already declared for largest value
        int smallest;   // Already declared for smallest value

        // Determine the largest value
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largest = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largest = secondNumber;
        } else {
            largest = thirdNumber;
        }

        // Determine the smallest value
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            smallest = firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            smallest = secondNumber;
        } else {
            smallest = thirdNumber;
        }


		// Output largest and smallest number. 
			System.out.println("The largest value is " + largest);
			System.out.println("The smallest value is " + smallest);
		
		
		}
	} 