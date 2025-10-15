import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Initialize the factorial variable
        long factorial = 1;

        // Calculate the factorial using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}

