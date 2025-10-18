public class Swap
{
    public static void main(String[] args)
    {
        // --- Test Set 1: 101, 22, -23 ---
        int first = 101;
        int second = 22;
        int third = -23;
        sortAndDisplay(first, second, third);

        // --- Test Set 2: 630, 1500, 9 ---
        first = 630;
        second = 1500;
        third = 9;
        sortAndDisplay(first, second, third);

        // --- Test Set 3: 21, 2, 2 ---
        first = 21;
        second = 2;
        third = 2;
        sortAndDisplay(first, second, third);
    }

    public static void sortAndDisplay(int first, int second, int third)
    {
        int temp;

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

        // Display results
        System.out.println("Smallest: " + first);
        System.out.println("Next largest: " + second);
        System.out.println("Largest: " + third);
        System.out.println(); // Blank line between each set
    }
}
