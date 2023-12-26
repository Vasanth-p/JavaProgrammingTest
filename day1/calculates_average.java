import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first floating-point number
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second floating-point number
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Calculate the average of the two numbers
        double average = (num1 + num2) / 2;

        // Display the result on the console with two decimal places
        System.out.printf("The average is: %.2f%n", average);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}