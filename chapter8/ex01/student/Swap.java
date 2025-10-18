public class Swap
{
    public static void main(String[] args)
    {
        int first, second, third, temp;

        // --- Test Set 1: 101, 22, -23 ---
        first = 101;
        second = 22;
        third = -23;

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
        System.out.println();

        // --- Test Set 2: 630, 1500, 9 ---
        first = 630;
        second = 1500;
        third = 9;

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
        System.out.println();

        // --- Test Set 3: 21, 2, 2 ---
        first = 21;
        second = 2;
        third = 2;

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
