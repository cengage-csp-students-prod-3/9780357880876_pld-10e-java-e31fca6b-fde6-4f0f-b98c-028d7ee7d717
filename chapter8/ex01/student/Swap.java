public class Swap
{
    public static void main(String[] args)
    {
        int first = 630;
        int second = 1500;
        int third = 9;
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

        System.out.println("Smallest: " + first);
        System.out.println("Next largest: " + second);
        System.out.println("Largest: " + third);
    }
}
