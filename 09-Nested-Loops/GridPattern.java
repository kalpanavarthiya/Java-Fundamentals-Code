public class GridPattern {
    public static void main(String[] args) {

        System.out.println("--- Building a 5x5 Square Pattern ---");

        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\nNested loops are tricky but cool!");
    }
}