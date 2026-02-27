import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the SDE Club ---");
        System.out.println("Do you have a laptop? (true/false): ");
        boolean hasLaptop = scanner.nextBoolean();

        System.out.println("Do you love coding? (true/false): ");
        boolean lovesCoding = scanner.nextBoolean();

        if (hasLaptop && lovesCoding) {
            System.out.println("You are a perfect fit for the club!");
        } else {
            System.out.println("You might need a laptop and some passion first!");
        }

        System.out.println("\n--- Weekend Plans ---");
        System.out.println("Is it raining? (true/false): ");
        boolean isRaining = scanner.nextBoolean();

        System.out.println("Is it a holiday? (true/false): ");
        boolean isHoliday = scanner.nextBoolean();

        if (isRaining || isHoliday) {
            System.out.println("Good day to stay home and practice Java!");
        } else {
            System.out.println("Go out and get some fresh air!");
        }

        System.out.println("\n--- Status Check ---");
        boolean isGameOver = false;
        if (!isGameOver) {
            System.out.println("The game is still running... Keep going!");
        }

        scanner.close();
    }
}