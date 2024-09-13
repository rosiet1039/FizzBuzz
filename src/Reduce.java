public class Reduce {
    public static int main(int n) {

        int i = 0;
        boolean divisibleBy2 = n % 2 == 0;
        while (n > 0) {

            if (divisibleBy2) {

                n = n / 2;
            } else {
                n = n - 1;
            }
            i++;
        }
        return i;
    }
}