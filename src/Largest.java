public class Largest {
    public static void main(String[] args) {
        int[] numbers = { 3, 7, 2, 8, 1 };
        int i = 0;
        int largest = numbers[0];
        while (i < numbers.length) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            i = i + 1;
        }
        System.out.println(largest);
    }
}
