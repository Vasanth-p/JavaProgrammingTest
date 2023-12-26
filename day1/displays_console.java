import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the entered integer from the user
        int enteredInteger = scanner.nextInt();

        // Display the entered integer on the console
        System.out.println("You entered: " + enteredInteger);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}