import java.util.Scanner;

public class GreetingBasedOnHour{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the hour
        System.out.print("Please enter the hour ");
        int hour = scanner.nextInt();

        // Determine the appropriate greeting
        if (hour >= 0 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Time is out of range");
        }
    }
}

