package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int gamaNum = scanner.nextInt();
        switch (gamaNum) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                Cli.welcome();
                break;
            default:
                System.out.println("Error! Please enter the correct number.");
                break;
        }


    }
}
