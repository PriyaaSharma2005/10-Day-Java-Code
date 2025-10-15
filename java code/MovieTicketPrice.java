import java.util.Scanner;

public class MovieTicketPrice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Prompt user for membership status
        System.out.print("Do you have a membership card? (yes/no): ");
        String membershipInput = scanner.next().trim().toLowerCase();
        boolean isMember = membershipInput.equals("yes");

        // Determine ticket price
        int price;
        if (age < 12) {
            price = 5;
        } else if (age >= 65) {
            price = 7;
        } else {
            price = 10;
        }

        // Apply membership discount
        if (isMember) {
            price -= 2;
        }

        // Print the ticket price
        System.out.println("The ticket price is $" + price + ".");
    }
}
