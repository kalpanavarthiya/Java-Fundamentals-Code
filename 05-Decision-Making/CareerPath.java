import java.util.Scanner;

public class CareerPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- SDE Career Advice Tool ---");
        System.out.print("How many hours did you code today? ");

        double codingHours = input.nextDouble();

        if (codingHours >= 8) {
            System.out.println("Whoa! You're a beast. Don't forget to drink water and sleep!");
        }
        else if (codingHours >= 4) {
            System.out.println("Great job! You're making solid progress toward that SDE role.");
        }
        else if (codingHours >= 1) {
            System.out.println("Consistency is key. Even one hour keeps the streak alive!");
        }
        else if (codingHours > 0) {
            System.out.println("Better than nothing, but let's try to hit at least an hour tomorrow.");
        }
        else {
            System.out.println("Life happens! Just make sure to get back to it soon.");
        }

        System.out.println("\nKeep pushing, Varthiya!");
        input.close();
    }
}