import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press x or X.

        while (true) {
            // Take the operator as input.
            char operator = input.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int ans = 0;
                if (operator == '+') {
                    ans = num1 + num2;
                } else if (operator == '-') {
                    ans = num1 - num2;
                } else if (operator == '*') {
                    ans = num1 * num2;
                } else if (operator == '/') {
                    ans = num1 / num2;
                } else if (operator == '%') {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operation. Try again.");
            }
        }
    }
}
