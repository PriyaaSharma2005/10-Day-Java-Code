public class CricketScoring{
    public static void main(String[] args) {
    int[] runs = {1, 4, 0, 6, 2, 0};
    int totalRuns = 0;
    int dotBalls = 0;
    int highestRun = 0;
    for (int run : runs) {
    totalRuns += run;
    if (run == 0) {
    dotBalls++;
    }
    if (run > highestRun) {
    highestRun = run;
    }
    }
    System.out.println("Total runs scored in the over: " + totalRuns);
    System.out.println("Number of dot balls: " + dotBalls);
    System.out.println("Highest run scored on a single ball: " + highestRun);
    }
   }
   