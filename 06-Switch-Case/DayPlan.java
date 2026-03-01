import java.util.Scanner;

public class DayPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- What day is it? (1-7) ---");
        System.out.print("Enter number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday: Heavy coding day. Focus on Java!");
                break;
            case 2:
                System.out.println("Tuesday: Debugging day. Don't lose your mind.");
                break;
            case 3:
                System.out.println("Wednesday: Mid-week check. Build a small project.");
                break;
            case 4:
                System.out.println("Thursday: Review day. Look at your GitHub.");
                break;
            case 5:
                System.out.println("Friday: Finish strong. No new bugs please!");
                break;
            case 6:
                System.out.println("Saturday: Rest and watch some tutorials.");
                break;
            case 7:
                System.out.println("Sunday: Plan for the next week and chill.");
                break;
            default:
                System.out.println("Wait, that's not a real day. Enter 1 to 7!");
                break;
        }

        System.out.println("\nEnd of schedule.");
        sc.close();
    }
}