public class ScoreList {
    public static void main(String[] args) {

        int[] grades = {85, 92, 78, 88, 95};

        System.out.println("--- Classroom Grade Report ---");
        System.out.println("Number of students: " + grades.length);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + " scored: " + grades[i]);
        }

        int total = 0;
        for (int score : grades) {
            total += score;
        }

        double average = (double) total / grades.length;
        System.out.println("\nClass Average: " + average);

        System.out.println("The array practice is done. Pushing to GitHub now!");
    }
}