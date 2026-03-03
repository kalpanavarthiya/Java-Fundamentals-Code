import java.util.Scanner;

public class PowerUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Phone Charger Simulator ---");
        System.out.print("Current battery percentage: ");
        int battery = input.nextInt();

        while (battery < 100) {
            battery += 10;

            if (battery > 100) {
                battery = 100;
            }

            System.out.println("Charging... now at " + battery + "%");
        }

        System.out.println("Phone fully charged! Ready to code.");
        input.close();
    }
}