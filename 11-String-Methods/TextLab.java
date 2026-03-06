
public class TextLab {
    public static void main(String[] args) {

        String username = "  Varthiya_SDE_2026  ";

        System.out.println("--- String Manipulation Lab ---");
        System.out.println("Original: [" + username + "]");

        String cleanName = username.trim();
        System.out.println("Cleaned: [" + cleanName + "]");

        System.out.println("Character count: " + cleanName.length());

        System.out.println("Shouting: " + cleanName.toUpperCase());

        if (cleanName.contains("SDE")) {
            System.out.println("Status: Professional Developer detected.");
        }

        String fixedName = cleanName.replace("_", " ");
        System.out.println("Final Format: " + fixedName);

        System.out.println("\nText processing complete. Pushing this to the cloud!");
    }
}