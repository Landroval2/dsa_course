public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int reverse = 0;
        while (n > 0) {
            int reminder = n % 10;
            n = n / 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(reverse);
    }
}
