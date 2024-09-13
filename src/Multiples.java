public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1000) {

            i = ThreeFiveJive(i);
        }
    }

    public static int ThreeFiveJive(int i) {

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 || divisibleBy5) {

            System.out.println(i);
        }
        i++;
        return i;
    }
}
