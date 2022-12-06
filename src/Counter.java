public class Counter {
    public static void main(String[] args) {
        int n = 11235;
        int number = 1;
        int num_reps = 0;

        while (n > 0) {
            int reminder = n % 10;
            n = n / 10;
            if (reminder == number) {
                num_reps = num_reps + 1;
            }
        }
        System.out.println(num_reps);
    }
}
