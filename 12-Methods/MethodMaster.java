public class MethodMaster {

    public static void main(String[] args) {
        System.out.println("--- Method Practice Starting ---");

        sayHello("Varthiya");

        int result = addNumbers(15, 25);
        System.out.println("The sum from my method is: " + result);

        checkCodingStatus(8);

        System.out.println("\nAll methods executed successfully!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "! Welcome to Topic 12.");
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void checkCodingStatus(int hours) {
        if (hours >= 5) {
            System.out.println("Status: You are on fire today!");
        } else {
            System.out.println("Status: Keep going, you're doing great.");
        }
    }
}