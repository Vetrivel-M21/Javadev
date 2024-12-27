

import java.util.Scanner;

class strong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt user to enter a value
        System.out.print("Enter the value: ");
        int num = sc.nextInt();  // Read the input number
        int temp = num;  // Store the original number to compare later
        int sum = 0;     // Variable to store the sum of factorials of digits

        // Process each digit of the number
        while (num > 0) {
            int lastDigit = num % 10;  // Extract the last digit
            int factorial = 1;

            // Calculate factorial of the last digit
            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }

            sum += factorial;  // Add the factorial of the digit to the sum
            num /= 10;  // Remove the last digit from the number
        }

        // Check if the sum of factorials is equal to the original number
        if (sum == temp) {
            System.out.println(temp + " is a Strong Number");
        } else {
            System.out.println(temp + " is not a Strong Number");
        }

        // Close the scanner
        sc.close();
    }
}
