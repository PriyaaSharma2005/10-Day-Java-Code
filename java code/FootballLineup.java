import java.util.Scanner;
public class FootballLineup {
 private String[] lineup;
 public FootballLineup() {
 lineup = new String[11];
 lineup[0] = "John";
 lineup[1] = "David";
 lineup[2] = "Mike";
 lineup[3] = "Chris";
 lineup[4] = "Alex";
 lineup[5] = "Ryan";
 lineup[6] = "James";
 }
 public void displayLineup() {
 System.out.println("Starting Lineup:");
 for (String player : lineup) {
 System.out.println(player);
 }
 }
 public boolean isPlayerInLineup(String playerName) {
 for (String player : lineup) {
 if (player.equalsIgnoreCase(playerName)) {
 return true;
 }
 }
 return false;
 }
 public void replaceInjuredPlayer(String injuredPlayer, String substitute) {
 for (int i = 0; i < lineup.length; i++) {
 if (lineup[i].equalsIgnoreCase(injuredPlayer)) {
 lineup[i] = substitute;
 System.out.println(injuredPlayer + " has been replaced by " + substitute + ".");
 return;
 }
 }
 System.out.println(injuredPlayer + " is not in the lineup.");
 }
 public static void main(String[] args) {
 FootballLineup footballLineup = new FootballLineup();
 Scanner scanner = new Scanner(System.in);
 footballLineup.displayLineup();
 System.out.print("Enter a player's name to check if they are in the lineup: ");
 String playerToCheck = scanner.nextLine();
 if (footballLineup.isPlayerInLineup(playerToCheck)) {
 System.out.println(playerToCheck + " is in the lineup.");
 } else {
 System.out.println(playerToCheck + " is not in the lineup.");
 }
 System.out.print("Enter the name of the injured player: ");
 String injuredPlayer = scanner.nextLine();
 System.out.print("Enter the name of the substitute player: ");
 String substitutePlayer = scanner.nextLine();
 footballLineup.replaceInjuredPlayer(injuredPlayer, substitutePlayer);
 footballLineup.displayLineup();
 }
}
