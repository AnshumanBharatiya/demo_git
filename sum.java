import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double numbers2 = scanner.nextDouble();

        // Calculate the sum
        double sum = number1 + numbers2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + numbers2 + " is: " + sum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
