import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your SDE goal for 2026? ");
        String goal = scanner.nextLine();

        System.out.println("How many hours will you code today? ");
        int hours = scanner.nextInt();

        System.out.println("Excellent! Practicing " + hours + " hours to become a " + goal + " is the way to go.");

        scanner.close();
    }
}