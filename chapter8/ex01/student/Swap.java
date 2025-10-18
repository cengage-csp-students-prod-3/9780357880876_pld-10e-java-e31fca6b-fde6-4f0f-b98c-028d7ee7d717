import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int first, second, third, temp;

        System.out.print("Enter first number: ");
        first = input.nextInt();

        System.out.print("Enter second number: ");
        second = input.nextInt();

        System.out.print("Enter third number: ");
        third = input.nextInt();

        // Compare and swap
        if (first > second) {
            temp = first;
            first = second;
            second = temp;
        }

        if (second > third) {
            temp = second;
            second = third;
            third = temp;
        }

        if (first > second) {
            temp = first;
            first = second;
            second = temp;
        }

        System.out.println("Smallest: " + first);
        System.out.println("Next largest: " + second);
        System.out.println("Largest: " + third);
    }
}
