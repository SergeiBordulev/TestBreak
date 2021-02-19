import java.util.Scanner;

public class TestBreak {
    public static void main(String[] args) {
        String fixedString = "sunny days";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter string:");
            String inputText = scanner.nextLine();

            if (inputText.equals(fixedString)) {
                System.out.println("Right");
                break;
            }

            System.out.println("Incorrect");
        }
    }
}
