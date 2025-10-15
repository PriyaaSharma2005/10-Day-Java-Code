import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int correctPassword = 4545;
        int attempts = 3;
        boolean accessGranted = false;

        while (attempts > 0) {
            System.out.print("Enter your password: ");
            int inputPassword = scanner.nextInt();

            if (inputPassword == correctPassword) {
                accessGranted = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect password. You have " + attempts + " attempt(s) left.");
            }
        }

        if (accessGranted) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied. You have used all your attempts.");
        }

        scanner.close();
    }
}
