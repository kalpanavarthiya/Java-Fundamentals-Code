class Developer {
    String name;
    String techStack;
    int projectsDone;

    void introduce() {
        System.out.println("Hi, I'm " + name + ". I specialize in " + techStack);
        System.out.println("I have completed " + projectsDone + " coding projects.");
    }
}

public class SDEProfile {
    public static void main(String[] args) {

        // Creating the object
        Developer myProfile = new Developer();

        // Assigning data to the object
        myProfile.name = "Varthiya";
        myProfile.techStack = "Java & Backend";
        myProfile.projectsDone = 13;

        System.out.println("--- Developer Object Created ---");
        myProfile.introduce();
    }
}