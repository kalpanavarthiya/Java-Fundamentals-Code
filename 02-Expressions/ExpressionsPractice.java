public class ExpressionsPractice {
    public static void main(String[] args) {
        int friends = 10;
        friends = friends + 1;
        friends = friends - 2;
        friends = friends * 2;
        friends = friends / 4;
        int remainder = friends % 3;
        friends++;
        friends--;
        System.out.println("Current friends: " + friends);
        System.out.println("Remainder after division: " + remainder);
    }
}
