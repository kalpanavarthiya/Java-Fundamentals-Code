public class RepeatTask {
    public static void main(String[] args) {

        System.out.println("--- Starting my 10-Day Coding Challenge ---");
        for (int day = 1; day <= 10; day++) {

            System.out.println("Day " + day + ": I practiced Java for 2 hours.");

            if (day == 5) {
                System.out.println(">> Halfway there! Keep going, Varthiya!");
            }
        }

        System.out.println("\nChallenge complete! 20 hours of coding added to GitHub.");
    }
}